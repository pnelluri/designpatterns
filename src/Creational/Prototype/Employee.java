package Creational.Prototype;

public class Employee implements Prototype {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	private String address;
	private double salary;
	
	Employee(int id){
		this.id = id;
		name = "Prashant";
		address = "SR Nagar";
		salary=10000;
		System.out.println("Loading Employee Records from database");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;

		System.out.println("Loading Employee Records from clone");
	}

	@Override
	public Prototype getClone() {
		return new Employee(id,name,address,salary);
	}

}
