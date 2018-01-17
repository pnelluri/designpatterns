package Behavioral.Strategy;

public class StrategeyClient {
public static void main(String[] args) {
	System.out.println("Add:"+ new StrategyContext(new Add()).doOperation(10, 20));


	System.out.println("Subtract:"+ new StrategyContext(new Subtract()).doOperation(10, 20));


	System.out.println("Mutiply:"+ new StrategyContext(new Multiply()).doOperation(10, 20));
}
}
