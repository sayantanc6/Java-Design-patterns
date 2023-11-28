package designpattern.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatMediatorImpl implements ChatMediator {
	
	List<User> users;
	// group chat feature not needed actually
	Map<String, List<User>> groupMap; 
	
	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
		this.groupMap = new HashMap<String, List<User>>();
	}

	@Override
	public void send(User sentuser,User receiveduser,Object msg) {
		if (sentuser != receiveduser) {
			receiveduser.receive(receiveduser, msg);
		}
	}

	@Override
	public void sendAll(User usersent,Object msg) {
		for (User user : users) {
			if (user == usersent) {
				continue;
			}
			this.receive(user, msg); 
		}
	}

	@Override
	public void receive(User user, Object msg) {
		user.receive(user, msg);
	}

	@Override
	public void addChatParticipant(User user) {
		users.add(user);
		System.out.println(((UserImpl) user).getUsername()+" : added by mediator");
		System.out.println();
	}

	@Override
	public void addAllChatParticipants(List<User> users) {
		this.users.addAll(users);
		System.out.println("following users are added as follows : ");
		for (User user : users) {
			System.out.println(((UserImpl) user).getUsername());
		}
		System.out.println();
	}

	@Override
	public void createGroup(String groupname, User user) {
		List<User> groupUsers = new ArrayList<User>();
		groupMap.put(groupname, groupUsers);
		System.out.println(((UserImpl) user).getUsername()+" : created group by name : "+groupname);
	}

	@Override
	public void addParticipantInGroup(String groupname, User user) {
		groupMap.get(groupname).add(user);
		System.out.println(((UserImpl) user).getUsername()+" : added in group by name : "+groupname);
	}

	@Override
	public void sendAllInGroup(User usersent, String groupname,Object msg) {
		List<User> userssentingroup = groupMap.get(groupname);
		for (User user : userssentingroup) {
			if (user == usersent) {
				continue;
			}
			this.receive(user, msg); 
		}
	}
}
