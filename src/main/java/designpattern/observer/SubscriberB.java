package designpattern.observer;

public class SubscriberB implements Subscriber {

	@Override
	public void stateChanged(Object object) {
		System.out.println("SubscriberB state changed : "+object);
	}

}
