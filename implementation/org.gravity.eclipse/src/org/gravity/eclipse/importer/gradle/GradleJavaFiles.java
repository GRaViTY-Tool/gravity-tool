package org.gravity.eclipse.importer.gradle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Set;
import java.util.stream.Collectors;

import org.gravity.eclipse.io.FileUtils;

/**
 * This class can be used to insert a print java files task into a gradle
 * project and to read the results
 *
 * @author speldszus
 *
 */
public class GradleJavaFiles {

	private static final String BUILD_TARGET = "exportCode";

	private GradleJavaFiles() {
		// This class should not be instantiated
	}

	/**
	 * Manipulates the build.gradle file for getting all java files and initializes
	 * an opject for getting them
	 *
	 * @param path The path to the build.gradle file
	 * @throws IOException if an I/O error occurs manipulating the file
	 * @return the Java source files
	 */
	public static Set<Path> getJavaFiles(final Path path) throws IOException, GradleImportException {
		final var output = FileUtils.createTempFile("gravityGradleJava", "");
		final var original = manipuateBuildFile(path, output);
		final var success = GradleBuild.build(path.getParent().toFile(), BUILD_TARGET);
		Files.move(original, path, StandardCopyOption.REPLACE_EXISTING);
		if(!success) {
			throw new GradleImportException("Couldn't get Java files");
		}
		return Files.readAllLines(output).parallelStream().map(Paths::get)
				.collect(Collectors.toSet());
	}



	/**
	 * Adds a task to save all java sourcefiles into temp file
	 *
	 * @param build The path to the build.gradle file
	 * @param output The path to which results should be written
	 * @throws IOException if an I/O error occurs manipulating the file
	 * @return path to a backup of the original file
	 */
	private static Path manipuateBuildFile(final Path build, final Path output) throws IOException {
		final var backupLocation = Files.copy(build, FileUtils.createTempFile("backupBuildGardle", ""),
				StandardCopyOption.REPLACE_EXISTING);
		final var taskCode = "\n" + "task " + BUILD_TARGET + " {\n" + "  def outputFile = file(\"" + output.toString().replace("\\", "/") + "\")\n"
				+ "  outputs.file  outputFile\n" + "  doLast {\n" + "    subprojects { project ->\n"
				+ "      project.plugins.withType(JavaPlugin) {\n"
				+ "        project.sourceSets.main.allJava.collect { sourceFile ->\n"
				+ "          outputFile << sourceFile.path + '\\n'\n" + "        }\n" + "      }\n" + "    }\n"
				+ "  }\n" + "}\n";
		Files.write(build, taskCode.getBytes(), StandardOpenOption.APPEND);
		return backupLocation;
	}

}
