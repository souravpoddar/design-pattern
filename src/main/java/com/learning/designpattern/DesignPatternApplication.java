package com.learning.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.designpattern.adapter.FoodProduct;
import com.learning.designpattern.adapter.GroceryItemAdapter;
import com.learning.designpattern.adapter.GroceryProduct;
import com.learning.designpattern.adapter.SwiggyStore;
import com.learning.designpattern.bridge.HDProcessor;
import com.learning.designpattern.bridge.NetflixVideo;
import com.learning.designpattern.bridge.UHD4kProcessor;
import com.learning.designpattern.bridge.Video;
import com.learning.designpattern.bridge.YoutubeVideo;
import com.learning.designpattern.decorator.AutomaticGearBox;
import com.learning.designpattern.decorator.BaseVarient;
import com.learning.designpattern.decorator.Cam360;
import com.learning.designpattern.decorator.Classic;
import com.learning.designpattern.decorator.Sunroof;
import com.learning.designpattern.observer.EmailAlertObserver;
import com.learning.designpattern.observer.IphoneStockObserver;
import com.learning.designpattern.observer.NotificationAlertObserver;
import com.learning.designpattern.observer.SmsAlertObserver;
import com.learning.designpattern.observer.StockObservable;
import com.learning.designpattern.strategy.GoodsVechicle;
import com.learning.designpattern.strategy.OffroadVechicle;
import com.learning.designpattern.strategy.SportsVechicle;
import com.learning.designpattern.strategy.Vechicle;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
		
		SwiggyStore store = new SwiggyStore();
		store.addItem(new FoodProduct());
		store.addItem(new FoodProduct());
		store.addItem(new GroceryItemAdapter(new GroceryProduct()));
		
		Video youtubeVideo = new YoutubeVideo(new HDProcessor());
		youtubeVideo.play("abc.mp4");
		Video netflixVideo = new NetflixVideo(new UHD4kProcessor());
		netflixVideo.play("abc.mp4");
		
		// Strategy design pattern
		Vechicle vechicle = new SportsVechicle();
		vechicle.drive();
		vechicle = new GoodsVechicle();
		vechicle.drive();
		vechicle = new OffroadVechicle();
		vechicle.drive();
		
		// Observer design pattern
		StockObservable observable = new IphoneStockObserver();
		NotificationAlertObserver emailObserver = new EmailAlertObserver("souravpoddar1992@gmail.com", observable);
		NotificationAlertObserver smsObserver = new SmsAlertObserver("souravpoddar", observable);
		NotificationAlertObserver emailObserver1 = new EmailAlertObserver("p.sourav1701@gmail.com", observable);
		observable.add(emailObserver);
		observable.add(emailObserver1);
		observable.add(smsObserver);
		
		observable.setStockCount(10);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		observable.setStockCount(0);
		observable.setStockCount(10);
		
		// Decorator Design pattern
		BaseVarient baseCar = new Classic();
		System.out.println(baseCar.cost());
		baseCar = new AutomaticGearBox(new Sunroof(new Classic()));
		System.out.println(baseCar.cost());
		baseCar = new Cam360(new Classic());
		System.out.println(baseCar.cost());
		
		
		
	}

}
