package Behavioral.Observer;

public class Square implements Shape{
	Subject sub = null;
	public Square(Subject sub) {
		sub.attach(this);
		this.sub= sub;
	}
	@Override
	public void getShape() {
		System.out.println("In Square"+sub.getValue());
		
	}

}
