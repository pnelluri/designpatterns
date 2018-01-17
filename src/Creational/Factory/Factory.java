package Creational.Factory;

public class Factory {
public Object getInstance(String type) {
	if(type.equals("D")) {
		return new Desert();
	}else if(type.equals("S")) {
		return new Starter();
	}
	return null;
}
}
