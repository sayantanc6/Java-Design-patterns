package designpattern.observer;

public interface Notifier {

	void NotifyAllOf(Object object);
	void RegisterSubscriber(Subscriber subscriber);
	void unregisterSubscriber(int index);
}
