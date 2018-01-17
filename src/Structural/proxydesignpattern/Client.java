package Structural.proxydesignpattern;
//cheque or debit card
//clent side
//The Proxy pattern sets the relationship between a proxy and the real subject at compile time
//Facade hides who you are talking to whereas proxy hides the location of the callee
//Always talking to single interface
//Provides different clients with different access rights to the target object
public class Client {
public static void main(String[] args) {
	ServiceInterface proxy = new ProxyInterface();
	System.out.println(proxy.message(0));
	System.out.println(proxy.message(10));
}
}
