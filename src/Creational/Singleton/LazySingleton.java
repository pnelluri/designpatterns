package Creational.Singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable,Cloneable{
	private static LazySingleton obj;  
	 private LazySingleton(){}  
	   
	 public static LazySingleton getInstance(){  
	   if (obj == null){  
	      synchronized(LazySingleton.class){  
	        if (obj == null){  
	            obj = new LazySingleton();//instance will be created at request time  
	        }  
	    }              
	    }  
	  return obj;  
	 }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}  
	  
}
