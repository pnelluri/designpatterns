package Structural.proxydesignpattern;
public class ProxyInterface implements ServiceInterface {
	public String message(int id) {
		if(id>0)
			return new RealInterface().message(id);
		else 
			return "Proxy"+id;
	}
	
}
