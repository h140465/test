package com.df.decorator.coffee;

import com.df.decorator.Beverage;

public class Decat extends Beverage {

	public Decat() {
		this.description = "Decat";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
