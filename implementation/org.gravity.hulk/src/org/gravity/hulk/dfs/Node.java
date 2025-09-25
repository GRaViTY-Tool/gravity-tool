package org.gravity.hulk.dfs;

import java.util.HashSet;
import java.util.Set;

public class Node {

	private final Set<Edge> incoming = new HashSet<>();
	private final Set<Edge> outgoing = new HashSet<>();
}
