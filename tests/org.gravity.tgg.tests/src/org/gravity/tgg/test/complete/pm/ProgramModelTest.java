package org.gravity.tgg.test.complete.pm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.Map.Entry;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.tgg.modisco.MoDiscoTGGConverter;
import org.gravity.tgg.test.complete.AbstractParameterizedTransformationTest;
import org.gravity.tgg.test.util.TimeStampUtil;
import org.gravity.typegraph.basic.TypeGraph;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

/**
 * 
 * Tests the forward transformation from java projects into program models
 * 
 * @author speldszus
 *
 */
public class ProgramModelTest extends AbstractParameterizedTransformationTest {

	private static final String XMI = "xmi";

	private static final Logger LOGGER = Logger.getLogger(ProgramModelTest.class);

	private static final boolean DEBUG = true;

	/**
	 * The constructor invoking the given super constructor
	 * 
	 * This constructor should be only called by junit!
	 * 
	 * @see org.gravity.tgg.test.complete.AbstractParameterizedTransformationTest#testForward()
	 * 
	 * @param name    The project name
	 * @param project The java project
	 */
	public ProgramModelTest(String name, IJavaProject project) {
		super(name, project);
	}

	@Override
	public final void testForward() {
		try {
			deleteFile(createSrcName(name, XMI));
			deleteFile(createTrgName(name, XMI));
			deleteFile(createCorrName(name, XMI));
			deleteFile(createProtocolName(name, XMI));

			try {
				final IPGConverter conv = new MoDiscoTGGConverter();

				conv.setDebug(DEBUG);

				LOGGER.log(Level.INFO, "Start forward integration - " + TimeStampUtil.getCurrentTimeStamp());
				if (!conv.convertProject(project, new NullProgressMonitor())) {
					throw new AssertionError("Trafo failed");
				}
				LOGGER.log(Level.INFO, "Finished forward integration - " + TimeStampUtil.getCurrentTimeStamp());

				TypeGraph pg = conv.getPG();
				pg.eResource().save(new FileOutputStream("outPM/" + pg.getTName() + ".xmi"), Collections.emptyMap());
				assertNotNull(pg);
				
				// Check, if element counts (e. g. number of TFlows) are as expected
				IPath path = project.getProject().getLocation().addTrailingSeparator().append("expect.json");
				File file = new File(path.toString());
				if (file.exists()) {
					FileReader fileReader = new FileReader(file);
					JsonObject map = (JsonObject) Jsoner.deserialize(fileReader);
					TreeIterator<EObject> it = pg.eResource().getAllContents();
					BigDecimal one = new BigDecimal(1);
					while (it.hasNext()) {
						EObject e = it.next();
						e.eClass().getEAllSuperTypes(); // TODO Count super types as well
						String typeName = e.eClass().getName();
						if (map.containsKey(typeName)) {
							BigDecimal count = (BigDecimal) map.get(typeName);
							map.put(typeName,  count.subtract(one));
						}
					}
					for (Entry<String, Object> entry : map.entrySet()) {
						Object value = entry.getValue();
						assertEquals(value + " elements of type " + entry.getKey() 
						+ " could not be transformed.", 0, ((BigDecimal) value).intValue());
					}
				}

			} catch (final MalformedURLException e) {
				throw new AssertionError(String.format("Unable to load '%s': %s", project, e.getMessage()));
			} catch (final IOException e) {
				throw new AssertionError(String.format("Unable to load '%s': %s", project, e.getMessage()));
			} catch (final JsonException e) {
				throw new AssertionError(String.format("Unable to load '%s': %s", project, e.getMessage()));
			}
		} catch (final IllegalArgumentException iae) {
			throw new AssertionError(String.format("Unable to load '%s': %s", project, iae.getMessage()));
		}
	}
}
