package Creational.Builder;
/*
 * Menu card in restaurent
 */
public class TestBuilderPattern {
public static void main(String[] args) {
	User user = new User.UserDetails("Prashant",31).setAddress("Hyderabad").setGender(1).build();
	System.out.println(user.toString());

	user = new User.UserDetails("Prashant",31).setGender(1).build();
	System.out.println(user.toString());

}
}
