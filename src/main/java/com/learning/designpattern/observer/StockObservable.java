package com.learning.designpattern.observer;

public interface StockObservable {

	void add(NotificationAlertObserver observer);
	void remove(NotificationAlertObserver observer);
	void notifySubscriber();
	void setStockCount(int newCount);
	int getStockCount();
	
}
	
