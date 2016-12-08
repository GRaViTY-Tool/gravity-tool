package org.gravity.tgg.modisco;

import java.io.IOException;
import java.net.MalformedURLException;

import org.eclipse.core.resources.IProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.converter.IPGConverterFactory;

public class MoDiscoTGGConverterFactory implements IPGConverterFactory {

	@Override
	public IPGConverter createConverter(IProject project) {
		try {
			return new MoDiscoTGGConverter();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
