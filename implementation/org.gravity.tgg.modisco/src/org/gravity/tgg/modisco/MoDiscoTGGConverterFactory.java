package org.gravity.tgg.modisco;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.converter.IPGConverterFactory;

/**
 * A factory for creating project specific converter instances
 * 
 * @author speldszus
 *
 */
public class MoDiscoTGGConverterFactory implements IPGConverterFactory {

	private static final Logger LOGGER = Logger.getLogger(MoDiscoTGGConverterFactory.class);

	@Override
	public IPGConverter createConverter(IProject project) {
		try {
			return new MoDiscoTGGConverter();
		} catch (MalformedURLException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
		return null;
	}

	@Override
	public String getName() {
		return "MoDisco Converter";
	}

	@Override
	public String getDescription() {
		return "This converter uses MoDisco as intermidiate representation.";
	}

	@Override
	public boolean belongsToFactory(IPGConverter converter) {
		return MoDiscoTGGConverter.class.isInstance(converter);
	}

	@Override
	public boolean supportsFWDTrafo() {
		return true;
	}

	@Override
	public boolean supportsBWDTrafo() {
		return false;
	}

	@Override
	public boolean supportsFWDSync() {
		return MoDiscoTGGActivator.getDefault().getSelectedPatcher()!=null;
	}

	@Override
	public boolean supportsBWDSync() {
		return true;
	}

}
