package designpattern.mediator;

import java.util.Arrays;

public class ChatMediatorTest {

	public static void main(String[] args) throws InvalidUserNameException {
		ChatMediator mediator = new ChatMediatorImpl();
		User pankaj = new UserImpl(mediator, "pankaj@78@Ankaj");
		User pankaj1 = new UserImpl(mediator, "pankaj@79@Ankaj");
		User pankaj2 = new UserImpl(mediator, "pankaj@80@Ankaj");
		User pankaj3 = new UserImpl(mediator, "pankaj@81@Ankaj");
		mediator.addAllChatParticipants(Arrays.asList(new User[]{pankaj,pankaj1,pankaj2,pankaj3})); 
 
		pankaj.send(pankaj,pankaj1, "hello",false,null); 
	} 
}
