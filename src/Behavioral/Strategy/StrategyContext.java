package Behavioral.Strategy;

public class StrategyContext {
	Strategy str ;
	StrategyContext(Strategy str){
		this.str = str;
	}
	public double doOperation(int x, int y) {
		return str.doOperation(x, y);
	}
}
