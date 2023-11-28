package designpattern.singleton;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingletonTest{

	public static void main(String[] args) {
		
		System.out.println("non multi-threaded environment :-");
		Car car1 = SingletonCarClassic.getInstance();
		Car car2 = SingletonCarClassic.getInstance();
		 
		System.out.println("car1 : "+car1.hashCode());
		System.out.println("car2 : "+car2.hashCode());
		
		System.out.println("multi-threaded environment :-"); 
		 
		List<Thread> myThreads = IntStream.range(0, 10).boxed()
								 .map(i -> new Thread(() ->  System.out.println(SingletonCarMultiThreaded.getInstance().hashCode())))
								 .collect(Collectors.toList());

		  myThreads.forEach(Thread::start); 
		  myThreads.forEach(t -> {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}
