package Creational.Singleton;

public enum EnumSingleton implements Cloneable {

	    INSTANCE;
	    
	    public  void doSomething(){
	        System.out.println("Enum");
	    }
}
