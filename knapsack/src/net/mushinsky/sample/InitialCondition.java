package net.mushinsky.sample;

import java.util.Collection;

/**
 * Interface to represent an initial condition to the bucket distribution problem.
 */
public interface InitialCondition
{
	/**
	 * Method to get the underlying subset for the condition.
	 * @return the subset of objects to which the condition pertains.
	 */
	public Collection<KnapsackObject> getSubjectSet();
	
	/**
	 * @return The bucket id to which the condition applies.
	 */
	public Integer getBucketId();
	
	/**
	 * The type of condition
	 * @return
	 */
	public InitialConditionType getType();
}