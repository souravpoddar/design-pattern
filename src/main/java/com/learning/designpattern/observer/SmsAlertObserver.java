package com.learning.designpattern.observer;

public class SmsAlertObserver implements NotificationAlertObserver {

	private String userName;
	private StockObservable observable;
	
	public SmsAlertObserver(String userName, StockObservable observable) {
		this.userName = userName;
		this.observable = observable;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("SMS notification send to user "+this.userName+" with available count "+observable.getStockCount());
	}

}
