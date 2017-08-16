package com.df.decorator.mixture;

import com.df.decorator.Beverage;
import com.df.decorator.CondimentDecorator;

/**
 * длещ
 * @author huang
 *
 */
public class Whip extends CondimentDecorator {

	public Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Whip";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
