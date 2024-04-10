package com.learning.designpattern.observer;

public class EmailAlertObserver implements NotificationAlertObserver {

	private String email;
	private StockObservable observable;
	
	public EmailAlertObserver(String email, StockObservable observable) {
		this.email = email;
		this.observable = observable;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Email notification send to "+this.email+" with available count "+observable.getStockCount());
	}

}
