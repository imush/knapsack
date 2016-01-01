package net.mushinsky.sample.impl;

import net.mushinsky.sample.KnapsackObject;

/**
 * A simple implementation of a {@link KnapsackObject}.
 */
public class KnapsackObjectImpl
	implements KnapsackObject
{
	private Integer _id;
	private double _weight;

	/**
 	 * @param id
	 * @param weight
	 */
	KnapsackObjectImpl(Integer id, double weight)
	{
		_id = id;
		_weight = weight;
	}
	
	/**
	 * @return the unique id.
	 */
	public Integer getId()
	{
		return _id;
	}
	
	/**
	 * @return the weight.
	 */
	public double getWeight()
	{
		return _weight;
	}
}
