package Creational.abstractfactory;

public class FactoryOfFactory   {
public AbstractFactory getFactory(String factoryType) {
	if(factoryType.equals("color")) {
		return new ColorFactory();
	}
	if(factoryType.equals("shape")) {
		return new ShapeFactory();
	}
	return null;
}
}
