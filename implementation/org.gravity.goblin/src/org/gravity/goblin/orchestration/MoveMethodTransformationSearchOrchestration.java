package org.gravity.goblin.orchestration;

import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.search.solution.executor.SearchHelper;

public class MoveMethodTransformationSearchOrchestration extends TransformationSearchOrchestration {

	protected MoveMethodSearchHelper mMSearchHelper;

	@Override
	protected SearchHelper createSearchHelper() {
		mMSearchHelper = new MoveMethodSearchHelper(this);
		return mMSearchHelper;
	}

	@Override
	public SearchHelper getSearchHelper() {
		if (mMSearchHelper == null) {
			createSearchHelper();
		}
		return mMSearchHelper;
	}

}
