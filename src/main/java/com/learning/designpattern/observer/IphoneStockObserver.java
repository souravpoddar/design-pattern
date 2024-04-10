package com.learning.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObserver implements StockObservable {

	List<NotificationAlertObserver> observerList = new ArrayList<>();
	int stockCount;
	@Override
	public void add(NotificationAlertObserver observer) {
		this.observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifySubscriber() {
		for(NotificationAlertObserver observer : observerList) {
			observer.update();
		}
	}

	@Override
	public void setStockCount(int newCount) {
		if(stockCount == 0) {
			this.stockCount = newCount;
			notifySubscriber();
		}else {
			this.stockCount = newCount;
		}
		
	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return this.stockCount;
	}

}
