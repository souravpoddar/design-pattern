package com.learning.designpattern.decorator;

public class Cam360 extends CarFeatures {

	BaseVarient baseVarient;
	public Cam360(BaseVarient baseVarient) {
		this.baseVarient = baseVarient;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.baseVarient.cost()+ 20;
	}
}
