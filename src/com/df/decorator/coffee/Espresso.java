package com.df.decorator.coffee;

import com.df.decorator.Beverage;

/**
 * Å¨Ëõ¿§·È
 * @author huang
 *
 */
public class Espresso extends Beverage {

	public Espresso(){
		this.description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
