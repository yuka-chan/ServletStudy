package model;

public class UserConfirmLogic {
	public void execute(User user) {
		System.out.println("register infomation");
		System.out.println("ID:" + user.getId());
		System.out.println("pass:" + user.getPassword());
		System.out.println("Name:" + user.getName());
	}
}
