package org.gravity.pm.multimodule.project;

import org.eclipse.core.resources.IProject;

/** A resolved dependency between two projects in the analyzed system. */
public record ProjectDependency(IProject source, IProject target) {}
