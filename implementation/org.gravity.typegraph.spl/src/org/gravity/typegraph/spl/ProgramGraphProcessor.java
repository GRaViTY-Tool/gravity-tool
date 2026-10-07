package org.gravity.typegraph.spl;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.tgg.modisco.pm.processing.pg.IProgramGraphProcessor;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * Adds source-level feature presence conditions to the discovered program model.
 * HAnS and Antenna parsing is intentionally independent of FeatureIDE project
 * nature and of any security-feature taxonomy.
 */
public class ProgramGraphProcessor implements IProgramGraphProcessor {

    private static final Logger LOGGER = Logger.getLogger(ProgramGraphProcessor.class);

    @Override
    public boolean process(final TypeGraph pg, final IProgressMonitor monitor) {
        final var project = EclipseProjectUtil.getProjectByName(pg.getTName());
        final var javaProject = JavaCore.create(project);
        for (final TAbstractType tType : pg.getAllTypes()) {
            if (tType.isDeclared() && (tType.getOuterType() == null)) {
                try {
                    new TypeProcessor(tType, javaProject).process();
                } catch (IOException | CoreException e) {
                    LOGGER.log(Level.ERROR, e);
                    return false;
                }
            }
        }
        return true;
    }
}
