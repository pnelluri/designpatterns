package Behavioral.Observer;

public class ObserverClient {
public static void main(String[] args) {
	Subject sub = new Subject();
	new Square(sub);
	new Circle(sub);
	
	sub.setValue(10);
	

	sub.setValue(20);
}
}
