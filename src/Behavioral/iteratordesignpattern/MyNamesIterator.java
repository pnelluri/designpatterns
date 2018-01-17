package Behavioral.iteratordesignpattern;

public class MyNamesIterator implements Container<String> {

	@Override
	public Iterator<String> getIterator() {
		return new CollectionNamesIterator();
	}

}
