package designpattern.observer;

public class SubscriberA implements Subscriber {

	@Override
	public void stateChanged(Object object) {
		System.out.println("SubscriberA state changed : "+object);
	}

}
