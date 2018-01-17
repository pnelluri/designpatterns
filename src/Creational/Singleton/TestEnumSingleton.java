package Creational.Singleton;

public class TestEnumSingleton {
public static void main(String[] args) {

	System.out.println(EnumSingleton.INSTANCE.hashCode());
	System.out.println(EnumSingleton.INSTANCE.hashCode());
	EnumSingleton.INSTANCE.doSomething();

	System.out.println(EarlySingleton.getInstance().hashCode());
	System.out.println(EarlySingleton.getInstance().hashCode());
	

	System.out.println(LazySingleton.getInstance().hashCode());
	System.out.println(LazySingleton.getInstance().hashCode());
	

	System.out.println(InnerClassSingleton.getInstance().hashCode());
	System.out.println(InnerClassSingleton.getInstance().hashCode());
}
}
