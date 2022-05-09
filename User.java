/**
 * User class implemented using the Builder pattern
 * @author jismail
 *
 */
public class User {
	
	private String firstname; // required field
	private String lastname; // required field
	private String email; // optional
	private String phone; // optional
	private int age; // optional
	
	
	/**
	 * private Constructor so the User can't be instantiated,
	 * force the outside world to use the UserBuilder
	 * @param builder
	 */
	private User(UserBuilder builder) {
		
		this.firstname = builder.firstname;
		this.lastname = builder.lastname;
		this.email = builder.email;
		this.phone = builder.phone;
		this.age = builder.age;
	}
	
	/*
	 * User object does not have any setter method, so its state can not be changed once it has been built. 
	 * This provides the desired immutability.
	 */
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}




	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}




	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}




	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}




	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}




	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone
				+ ", age=" + age + "]";
	}




	// the UserBuilder class
	public static class UserBuilder{
		
		private String firstname; // required field
		private String lastname; // required field
		private String email; // optional
		private String phone; // optional
		private int age; // optional
		
		public UserBuilder(String fname, String lname) {
			this.firstname = fname;
			this.lastname = lname;
		}
		
		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder age(int a) {
			this.age = a;
			return this;
		}
		
		// ** Important: need to build the User **
		public User build() {
			User user = new User(this);
			return user;
		}
		
	}// end UserBuilder

}// end User
