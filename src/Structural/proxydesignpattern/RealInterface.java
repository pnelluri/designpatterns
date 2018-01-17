package Structural.proxydesignpattern;
public class RealInterface implements ServiceInterface{
	public String message(int message) {
		return "Real"+message;
	}
}
