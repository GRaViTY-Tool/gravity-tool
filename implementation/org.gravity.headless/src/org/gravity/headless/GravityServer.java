package org.gravity.headless;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.openapi.OpenApiFeature;
import org.eclipse.core.runtime.Platform;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.headless.config.LoggingConfiguration;
import org.gravity.headless.webapi.impl.ProgramModelApiServiceImpl;

/**
 * The interface for launching the GRaViTY services as REST Service
 *
 * @author speldszus
 *
 */
public class GravityServer {

	private final Server server;

	/**
	 * Use the launchServer method to create an instance
	 *
	 * @param server The Apache cxf server that is used by GRaViTY
	 */
	private GravityServer(final Server server) {
		this.server = server;
	}

	/**
	 * Launches a GRaViTY REST Server with the given configuration
	 *
	 * @param cache           The location of the model cache
	 * @param maxRepositories The maximum number of repositories that should be
	 *                        cached in the workspace
	 * @param maxModels       The maximum number of models that should be cached in
	 *                        the file system
	 * @param domain          The domain on which the server should be launched
	 * @param port            The port on which the server should operate
	 * @return The launched server
	 * @throws IOException
	 */
	public static GravityServer launchServer(File cache, final LoggingConfiguration log, final int maxRepositories,
			final int maxModels, final String domain, final int port) throws IOException {
		if ((maxModels > 0) && ((cache == null) || !cache.exists())) {
			cache = FileUtils.createTempDirectory("gravity-cache").toFile();
		}
		final var implementor = new ProgramModelApiServiceImpl();
		if ((log != null) && log.loggingEnabled()) {
			implementor.setLogConfiguration(log);
		}
		implementor.setMaxModels(maxModels);
		implementor.setMaxRepositories(maxRepositories);
		implementor.setCache(cache);

		final var openApiFeature = new OpenApiFeature();
		final var openapi = "openapi.json";
		final var resource = Platform.getBundle(HeadlessActivator.PLUGIN_ID).getResource(openapi);
		final var tmp = FileUtils.createTempFile(openapi, ".json");
		Files.copy(resource.openStream(), tmp, StandardCopyOption.REPLACE_EXISTING);
		openApiFeature.setConfigLocation(tmp.toAbsolutePath().toString());

		final var sf = new JAXRSServerFactoryBean();
		sf.setServiceClass(ProgramModelApiServiceImpl.class);
		sf.setServiceBean(implementor);
		sf.setAddress("http://" + domain + ":" + port + "/");
		sf.setFeatures(Collections.singletonList(openApiFeature));
		return new GravityServer(sf.create());
	}

	/**
	 * Shuts the server down cleanly
	 */
	public void stopServer() {
		this.server.stop();
		this.server.destroy();
	}
}