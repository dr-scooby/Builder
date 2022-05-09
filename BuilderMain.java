
public class BuilderMain {

	
	public static void main(String[] args) {
		// different examples on building users with different info:
    // first and last name is required, other info is optional
		User user1 = new User.UserBuilder("John", "Smith").build();
		System.out.println("User 1:" + user1);
		
		User user2 = new User.UserBuilder("Ali", "Ismael").age(21).build();
		System.out.println("User 2:" + user2);
		
		User user3 = new User.UserBuilder("Luke", "Skywalker").email("hiluke@gmail.com").age(45).phone("456").build();
		System.out.println("User 3:" + user3);
	}
}
