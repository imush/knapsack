package net.mushinsky.sample;

public interface KnapsackObject
{
	/**
	 * @return a unique integer id
	 */
	public Integer getId();
	
	/**
	 * @return the object weight (signed double)
	 */
	public double getWeight();
}
