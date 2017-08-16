package com.df.decorator.coffee;

import com.df.decorator.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
