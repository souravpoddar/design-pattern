package com.learning.designpattern.strategy;

public class Vechicle {

	private DriveStrategy driveStrategy;
	
	public Vechicle(DriveStrategy strategy) {
		this.driveStrategy = strategy;
	}
	
	public void drive() {
		this.driveStrategy.drive();
	}
}
