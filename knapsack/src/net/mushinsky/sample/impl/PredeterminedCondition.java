package net.mushinsky.sample.impl;

import java.util.Collection;

import net.mushinsky.sample.InitialCondition;
import net.mushinsky.sample.InitialConditionType;
import net.mushinsky.sample.KnapsackObject;

/**
 * A class for {@link InitialCondition}s that are "unconditional":
 * move certain objects to given bucket.
 */
public class PredeterminedCondition 
	extends AbstractInitialCondition 
{
	/**
	 * @param bucketId
	 * @param subjectSet
	 */
	public PredeterminedCondition(Integer bucketId,
		Collection<KnapsackObject> subjectSet)
	{
		super(bucketId, subjectSet);
	}
	
	/**
	 * @see InitialConditionType
	 */
	public InitialConditionType getType()
	{
		return InitialConditionType.PREDETERMINED;
	}
}
