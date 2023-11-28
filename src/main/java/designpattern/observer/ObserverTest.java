package designpattern.observer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ObserverTest {

	public static void main(String[] args) {
		Publisher publisher = new Publisher();
		publisher.RegisterSubscriber(new SubscriberA()); 
		publisher.RegisterSubscriber(new SubscriberB());
		publisher.RegisterSubscriber(new SubscriberC()); 
		
		List<Thread> threads = IntStream.range(0, 10).boxed()
			.map(i -> new Thread(() -> {
											System.out.println("subscribed : "+i);
											publisher.setState(i);
										}))
			.collect(Collectors.toList());
		threads.forEach(Thread::start);
		threads.forEach(t -> {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}
