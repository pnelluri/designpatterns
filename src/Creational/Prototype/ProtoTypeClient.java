package Creational.Prototype;
/**
 * Chess Game Initial set up
 * @author Nisum
 *
 */
public class ProtoTypeClient {
public static void main(String[] args) {
	Employee e = new Employee(10);
	System.out.println(e.toString());
	Employee clone = (Employee) e.getClone();
	System.out.println(clone.toString());
}
}
