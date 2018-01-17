package Creational.Singleton;
/**
 * CM for a state
 * @author Nisum
 *
 */
public class CloneSingletonTest {
	public static void main(String[] args) {
		EarlySingleton es = EarlySingleton.getInstance();
		System.out.println(es.hashCode());
		try {
			EarlySingleton esClone = (EarlySingleton)es.clone();
			System.out.println(esClone.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LazySingleton ls = LazySingleton.getInstance();
		System.out.println(ls.hashCode());
		try {
			LazySingleton esClone = (LazySingleton)ls.clone();
			System.out.println(esClone.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
