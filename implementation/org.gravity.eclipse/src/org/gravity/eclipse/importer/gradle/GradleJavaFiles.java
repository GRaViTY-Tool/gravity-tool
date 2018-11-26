package org.gravity.eclipse.importer.gradle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This class can be used to insert a print java files task into a gradle
 * project and to read the results
 * 
 * @author speldszus
 *
 */
public class GradleJavaFiles {

	private static final String BUILD_TARGET = "exportCode";
	private final Path output;
	private final Path original;
	private final Path path;

	/**
	 * Manipulates the build.gradle file for getting all java files and initializes
	 * an opject for getting them
	 * 
	 * @param path The path to the build.gradle file
	 * @throws IOException if an I/O error occurs manipulating the file
	 */
	public GradleJavaFiles(Path path) throws IOException {
		this.path = path;
		this.output = Files.createTempFile("gravityGradleJava", "");
		this.original = manipuateBuildFile(path);
	}

	public Set<Path> getJavaFiles() throws IOException, GradleImportException {
		boolean success = GradleBuild.build(path.getParent().toFile(), BUILD_TARGET);
		if(!success) {
			throw new GradleImportException("Couldn't get Java files");
		}
		final Set<Path> collect = Files.readAllLines(output).parallelStream().map(s -> Paths.get(s))
				.collect(Collectors.toSet());
		Files.move(original, path, StandardCopyOption.REPLACE_EXISTING);
		return collect;
	}

	

	/**
	 * Adds a task to save all java sourcefiles into temp file
	 * 
	 * @param build The path to the build.gradle file
	 * @throws IOException if an I/O error occurs manipulating the file
	 * @return path to a backup of the original file
	 */
	private Path manipuateBuildFile(Path build) throws IOException {
		Path original = Files.copy(build, Files.createTempFile("backupBuildGardle", ""),
				StandardCopyOption.REPLACE_EXISTING);
		String taskCode = "\n" + "task " + BUILD_TARGET + " {\n" + "  def outputFile = file(\"" + output + "\")\n"
				+ "  outputs.file  outputFile\n" + "  doLast {\n" + "    subprojects { project ->\n"
				+ "      project.plugins.withType(JavaPlugin) {\n"
				+ "        project.sourceSets.main.allJava.collect { sourceFile ->\n"
				+ "          outputFile << sourceFile.path + '\\n'\n" + "        }\n" + "      }\n" + "    }\n"
				+ "  }\n" + "}\n";
		Files.write(build, taskCode.getBytes(), StandardOpenOption.APPEND);
		return original;
	}

}
