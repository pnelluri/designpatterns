package Behavioral.iteratordesignpattern;


public class CollectionNamesIterator implements Iterator<String>{
	int i=0;
	String[] names;
	@Override
	public boolean hasNext() {
		System.out.println(i+"hasNext");
		if(i<names.length) {
			return true;
		}
		return false;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	@Override
	public String next() {
		System.out.println(i+"Next");
		if(i<names.length) {
			return names[i++];
		}
		else
			return null;
	}

}
