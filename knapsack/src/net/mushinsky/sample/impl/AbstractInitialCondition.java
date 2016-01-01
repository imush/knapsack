package net.mushinsky.sample.impl;

import java.util.Collection;

import net.mushinsky.sample.InitialCondition;
import net.mushinsky.sample.KnapsackObject;

/**
 * A superclass for {@link InitialCondition}s.
 */
public abstract class AbstractInitialCondition
	implements InitialCondition
{

	protected Collection<KnapsackObject> _subjectSet;
	protected Integer _bucketId;

	public AbstractInitialCondition(Integer bucketId,
		Collection<KnapsackObject> subjectSet) {
		_subjectSet = subjectSet;
		_bucketId = bucketId;
	}

	/**
	 * @return the set of {@link KnapsackObject}s subject to this condition.
	 */
	public Collection<KnapsackObject> getSubjectSet()
	{
		return _subjectSet;
	}

	/**
	 * @return the bucket id to which this condition applies.
	 */
	public Integer getBucketId()
	{
		return _bucketId;
	}
}
