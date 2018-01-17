package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
List<Shape> list = new ArrayList<>();
private int value;
public void attach(Shape shape) {
	list.add(shape);
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
	notifyAllObservers();
	
}
public void notifyAllObservers() {
	for(Shape s: list) {
		s.getShape();
	}
}

}
