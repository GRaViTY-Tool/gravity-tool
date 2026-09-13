package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Type;
import org.gravity.modisco.MAnonymousClass;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

public class AnonymousTypeNameProcessing extends AbstractTypedModiscoProcessor<Type> {

	@Override
	public boolean process(final MGravityModel model, final Collection<Type> elements, final IFolder debug,
			final IProgressMonitor monitor) {
		final var pool = ForkJoinPool.commonPool();
		elements.parallelStream().forEach(type -> pool.submit(new Processor(type, pool)));
		return pool.awaitQuiescence(2, TimeUnit.HOURS);
	}

	@Override
	public Class<Type> getSupportedType() {
		return Type.class;
	}

	private final class Processor implements Callable<Boolean> {
		private final EObject root;
		private final ExecutorService service;

		private Processor(final EObject root, final ExecutorService executorService) {
			this.root = root;
			this.service = executorService;
		}

		@Override
		public Boolean call() throws Exception {
			var i = 1;
			final var iterator = this.root.eAllContents();
			while (iterator.hasNext()) {
				final var next = iterator.next();
				if (next instanceof final MAnonymousClass instance) {
					instance.setIndex(i++);
					iterator.prune();
					this.service.submit(new Processor(instance, this.service));
				}
			}
			return true;
		}
	}

}
