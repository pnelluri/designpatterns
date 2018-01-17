package Creational.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {
	private static void failScenario()  throws FileNotFoundException, IOException, ClassNotFoundException{
		 EarlySingleton instanceOne = EarlySingleton.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
	                "filename.ser"));
	        out.writeObject(instanceOne);
	        out.close();
	        
	        //deserailize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream(
	                "filename.ser"));
	        EarlySingleton instanceTwo = (EarlySingleton) in.readObject();
	        in.close();
	        
	        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	        

	}
	private static void successScenario()  throws FileNotFoundException, IOException, ClassNotFoundException{
		 LazySingleton instanceOne = LazySingleton.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
	                "filename.ser"));
	        out.writeObject(instanceOne);
	        out.close();
	        
	        //deserailize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream(
	                "filename.ser"));
	        LazySingleton instanceTwo = (LazySingleton) in.readObject();
	        in.close();
	        
	        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
	        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	        

	}
	 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	        
		 failScenario();
		 successScenario();
			    }
}
