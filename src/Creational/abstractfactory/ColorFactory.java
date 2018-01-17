package Creational.abstractfactory;

public  class ColorFactory implements AbstractFactory{
	public  Shape getShape(String type) {
		return null;
	}
	public Color getColor(String type) {
		switch (type) {
		case "RED":
			return new RedColor();
			

		case "Green":
			return new GreenColor();
			
		default:
			break;
		}
		return null;
	}
}
