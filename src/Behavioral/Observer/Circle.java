package Behavioral.Observer;

public class Circle implements Shape{
	Subject sub = null;
	
	public Circle(Subject sub) {
		sub.attach(this);
		this.sub =sub;
	}
	@Override
	public void getShape() {
		System.out.println("In Circle"+sub.getValue());
		
	}

}
