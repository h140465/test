package com.df.decorator.mixture;

import com.df.decorator.Beverage;
import com.df.decorator.CondimentDecorator;

/**
 * Ä¦¿¨
 * @author huang
 *
 */
public class Mocha extends CondimentDecorator {

	public Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
