package Behavioral.iteratordesignpattern;


public class CollectionNumbersIterator implements Iterator<Integer>{
	int i=0;
	Integer[] names;
	@Override
	public boolean hasNext() {
		System.out.println(i+"hasNext");
		if(i<names.length) {
			return true;
		}
		return false;
	}

	public Integer[] getNames() {
		return names;
	}

	public void setNames(Integer[] names) {
		this.names = names;
	}

	@Override
	public Integer next() {
		System.out.println(i+"Next");
		if(i<names.length) {
			return names[i++];
		}
		else
			return new Integer(0);
	}

}
