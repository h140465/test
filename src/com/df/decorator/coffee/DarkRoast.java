package com.df.decorator.coffee;

import com.df.decorator.Beverage;

/**
 * …Ó∂»∫Ê±∫øß∑»
 * @author huang
 *
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
