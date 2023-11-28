package designpattern.mediator;

import java.util.regex.Pattern;

public class UserImpl implements User {
	
	private ChatMediator mediator;
	private String username; 
	private String usernamePattern = "^(([a-z]+)|([A-Z]+)|([!@#$%^z&*()_:?]+)|([0-9]+)){12,}$";

	public UserImpl(ChatMediator mediator, String username) throws InvalidUserNameException {
		super();
		this.mediator = mediator;
		if(Pattern.compile(usernamePattern).matcher(username).find()) 
			this.username = username; 
		else 
			throw new InvalidUserNameException("username has atleast one uppercase,atleast one lowercase,atleast one special character,atleast one digit and minimum 12 characters");		
		}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void send(User usersent,User receivedUser,Object msg,Boolean sendall,String groupname) {
		if (sendall == false) {
			System.out.println(((UserImpl) usersent).getUsername() + " : sent by : " + msg);
			System.out.println();
			mediator.send(this, receivedUser, msg);
		}
		if (sendall == true && groupname==null) {
			System.out.println(((UserImpl) usersent).getUsername() + " : sent by : " + msg);
			System.out.println();
			mediator.sendAll(usersent, msg);
		}
		
		if (sendall == true && groupname!=null) {
			System.out.println(((UserImpl) usersent).getUsername() + " : sent by : " + msg);
			System.out.println();
			mediator.sendAllInGroup(usersent, groupname, msg);
		}
	}

	@Override
	public void receive(User user, Object msg) {
		System.out.println(msg+" : received by : "+((UserImpl) user).getUsername()); 
	}
 
	@Override
	public void createGroup(User user, String groupname) {
		mediator.createGroup(groupname, user);
	}

	@Override
	public void addmemberinGroup(User user, String groupname) {
		mediator.addParticipantInGroup(groupname, user);
	}
}
