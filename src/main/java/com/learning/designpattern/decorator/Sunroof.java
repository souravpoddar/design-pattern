package com.learning.designpattern.decorator;

public class Sunroof extends CarFeatures {

	BaseVarient baseVarient;
	
	public Sunroof(BaseVarient baseVarient) {
		this.baseVarient = baseVarient;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.baseVarient.cost()+ 25;
	}
}
