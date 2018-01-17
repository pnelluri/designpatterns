package Behavioral.iteratordesignpattern;

public class ClientIterator {
public static void main(String[] args) {
	MyNamesIterator iterator = new MyNamesIterator();
	String names[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};
	CollectionNamesIterator itr = (CollectionNamesIterator)iterator.getIterator();
	itr.setNames(names);
	
	while (itr.hasNext()) {
		String type = (String) itr.next();
		System.out.println(type);
		
	}
	
	MyNumbersIterator numNterator = new MyNumbersIterator();
	Integer values[]={1,2,3,4,5,6};
	CollectionNumbersIterator numIitr = (CollectionNumbersIterator)numNterator.getIterator();
	numIitr.setNames(values);
	
	while (numIitr.hasNext()) {
		Integer type = (Integer) numIitr.next();
		System.out.println(type);
		
	}
}
}
