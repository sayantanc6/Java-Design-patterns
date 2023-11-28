package designpattern.observer;

public class SubscriberC implements Subscriber {

	@Override
	public void stateChanged(Object object) {
		System.out.println("SubscriberC state changed : "+object);
	}

}
