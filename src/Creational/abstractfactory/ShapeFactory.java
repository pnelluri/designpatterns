package Creational.abstractfactory;

public  class ShapeFactory implements AbstractFactory{
	
	public Shape getShape(String type) {
		switch (type) {
		case "Circle":
			return new CircleShape();
			

		case "Square":
			return new SquareShape();
			
		default:
			break;
		}
		return null;
	}
	@Override
	public Color getColor(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
