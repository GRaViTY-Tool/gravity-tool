package org.gravity.tgg.tests.configure.dummy;

import org.eclipse.core.resources.IProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.converter.IPGConverterFactory;

public class DummyConverterFactory implements IPGConverterFactory {

	@Override
	public boolean supported(final IProject project) {
		return true;
	}

	@Override
	public IPGConverter createConverter(final IProject project) {
		return new DummyConverter();
	}

	@Override
	public boolean belongsToFactory(final IPGConverter converter) {
		return converter instanceof DummyConverter;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public boolean supportsFWDTrafo() {
		return true;
	}

	@Override
	public boolean supportsBWDTrafo() {
		return true;
	}

	@Override
	public boolean supportsFWDSync() {
		return true;
	}

	@Override
	public boolean supportsBWDSync() {
		return true;
	}

}