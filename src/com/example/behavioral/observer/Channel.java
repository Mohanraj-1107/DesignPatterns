//$Id$
package com.example.behavioral.observer;
import java.util.*;

public class Channel implements Subject{
	
	private List<Observer> subscribers=new ArrayList<>();
	
	private String videoTitle;
	
	private String channelName;
	
	public Channel(String channelName) {
		this.channelName=channelName;
	}

	public void addObserver(Observer observer) {
		subscribers.add(observer);
	}

	public void removeObserver(Observer observer) {
		subscribers.remove(observer);
	}
	
	@Override
	public void notifyObserver() {
		for(Observer observer:subscribers) {
			observer.getNotification(videoTitle+"in"+channelName);
		}
	}
	
	public void uploadVideo(String title) {
		this.videoTitle=title;
		notifyObserver();
	}
}
