package Repair.visibility;

import java.util.Collection;
import java.util.LinkedList;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

public class VisibilityReducer {

	public static Collection<TMember> reduce(TypeGraph pg) {
		Collection<TMember> changed = new LinkedList<>();

		for (TClass tClass : pg.getClasses()) {
			if(!tClass.isTLib())
			for (TMember tMember : tClass.getDefines()) {
				if (!(tMember instanceof TConstructorDefinition)) {
					TVisibility tCurVis = tMember.getTModifier().getTVisibility();
					int tMinVis = 0;
					for (TAccess tAccess : tMember.getAccessedBy()) {
						TVisibility tVis = tMember.getMinimumRequiredVisibility(tAccess.getTSource());
						if (tVis.getValue() > tMinVis) {
							tMinVis = tVis.getValue();
						}
						if (tMinVis == 3) {
							break;
						}
					}

					if (tCurVis.getValue() != tMinVis) {
						tMember.getTModifier().setTVisibility(TVisibility.get(tMinVis));
						changed.add(tMember);
					}
				}
			}
		}

		return changed;
	}
}
