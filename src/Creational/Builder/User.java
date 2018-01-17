package Creational.Builder;

public class User {
	public static class UserDetails{
		private String name;
		private String address;
		private int gender;
		private int age;

		public String getAddress() {
			return address;
		}
		public UserDetails(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public UserDetails setAddress(String address) {
			this.address = address;
			return this;
		}
		public int getGender() {
			return gender;
		}
		public UserDetails setGender(int gender) {
			this.gender = gender;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
	private int age;
	private String name;
	private String address;
	private int gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", address=" + address + ", gender=" + gender + "]";
	}
	public User(UserDetails userDets) {
		this.name = userDets.name;
		this.age = userDets.age;
		this.gender = userDets.gender;
		this.address = userDets.address;
	}
	
}
