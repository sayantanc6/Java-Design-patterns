package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Notifier {
	
	List<Subscriber> subscribers;
	Object state;
	
	public Publisher() {
		subscribers = new ArrayList<Subscriber>();
	}

	@Override
	public void NotifyAllOf(Object object) { 
		subscribers.forEach(subscriber -> subscriber.stateChanged(object));
	}

	@Override
	public void RegisterSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unregisterSubscriber(int index) {
		subscribers.remove(index);
	}

	public Object getState() {
		return state;
	}

	public void setState(Object state) {
		this.state = state;
		NotifyAllOf(state); 
	}

}
