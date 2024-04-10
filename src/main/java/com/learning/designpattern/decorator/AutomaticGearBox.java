package com.learning.designpattern.decorator;

public class AutomaticGearBox extends CarFeatures {

	BaseVarient base;
	
	public AutomaticGearBox(BaseVarient baseVarient) {
		this.base = baseVarient;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.base.cost()+ 10;
	}
}
