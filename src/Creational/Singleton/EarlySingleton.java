package Creational.Singleton;

import java.io.Serializable;

public class EarlySingleton implements Serializable,Cloneable{
	private static EarlySingleton es = new EarlySingleton();
	public static EarlySingleton getInstance() {
		return es;
	}
	/*static {
		 es = new EarlySingleton();
	}*/
	 protected Object readResolve() {  
         return getInstance();  
     }  
	private EarlySingleton() {
		
	}
	@Override
	  protected Object clone() throws CloneNotSupportedException 
	  {
	    return getInstance();
	  }
}
