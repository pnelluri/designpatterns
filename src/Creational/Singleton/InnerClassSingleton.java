package Creational.Singleton;

public class InnerClassSingleton {

	    private InnerClassSingleton() {
	    	try {
	    		if(SingletonHelper.INSTANCE!=null)
				throw new RuntimeException("You can not create My Object");
			} catch (Exception e) {
				throw e;
			}
	    }
	    
	    private static class SingletonHelper{
	        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
	    }
	    
	    public static InnerClassSingleton getInstance(){
	        return SingletonHelper.INSTANCE;
	    }
}
