package designpattern.mediator;

import java.util.List;

public interface ChatMediator {

	void send(User sentuser,User receiveduser,Object msg);
	void sendAll(User usersent,Object msg);
	void receive(User receiveduser, Object msg);
	void addChatParticipant(User user);
	void addAllChatParticipants(List<User> users);
	void createGroup(String groupname,User user);
	void addParticipantInGroup(String groupname,User user);
	void sendAllInGroup(User usersent,String groupname,Object msg);
}
