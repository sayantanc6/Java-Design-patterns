package designpattern.mediator;

public interface User { 

	void send(User usersent,User receiveduser,Object msg,Boolean sendall,String groupname);
	void receive(User user, Object msg);
	void createGroup(User user,String groupname);
	void addmemberinGroup(User user,String groupname);
}
