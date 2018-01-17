package Creational.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryTestClass {
public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	AbstractFactory af = null;
	try {
		System.out.println("Your Color Choice");
		String color = br.readLine();
		System.out.println("Shape Choice");
		String shape = br.readLine();
		af = new FactoryOfFactory().getFactory("color");
		af.getColor(color).getColorType();
		af = new FactoryOfFactory().getFactory("shape");
		af.getShape(shape).getShapeType();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
