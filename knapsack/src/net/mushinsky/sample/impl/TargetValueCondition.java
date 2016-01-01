package net.mushinsky.sample.impl;

import java.util.Collection;

import net.mushinsky.sample.InitialConditionType;
import net.mushinsky.sample.KnapsackObject;

public class TargetValueCondition
	extends AbstractInitialCondition
{

	private double[] _target;

	/**
	 * 
	 * @param bucketId
	 * @param subjectSet
	 * @param minSum lower bound of target interval
	 * @param maxSum upper bound of target interval
	 */
	public TargetValueCondition(Integer bucketId,
		Collection<KnapsackObject> subjectSet,
		double minSum, double maxSum) 
	{
		super(bucketId, subjectSet);
		_target = new double[] {minSum, maxSum};
	}

	/**
	 * @return the appropriate type.
	 */
	public InitialConditionType getType()
	{
		return InitialConditionType.TARGET_VALUE;
	}
	
	/**
	 * Returns the target value interval.
	 * @return an array with two elements representing the target value
	 * interval.
	 */
	public double[] getTarget()
	{
		return _target;
	}
}
