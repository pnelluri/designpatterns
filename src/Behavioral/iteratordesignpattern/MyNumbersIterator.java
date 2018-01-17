package Behavioral.iteratordesignpattern;

public class MyNumbersIterator implements Container<Integer> {

	@Override
	public Iterator<Integer> getIterator() {
		return new CollectionNumbersIterator();
	}

}
