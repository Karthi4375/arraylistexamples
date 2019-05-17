import java.util.Collections;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {

		// FIFO
		ArrayList<String> southstates = new ArrayList<String>();

		System.out.println("size :" + southstates.size() + " and IsEmpty: " + southstates.isEmpty());

		southstates.add("AP");
		southstates.add("TG");
		southstates.add("TN");
		southstates.add(2, "KR");
		southstates.add("KT");

		System.out.println(southstates);
		System.out.println("size :" + southstates.size() + " and IsEmpty: " + southstates.isEmpty());

		ArrayList<String> northstates = new ArrayList<String>();

		northstates.add("DL");
		northstates.add("AR");

		ArrayList<String> indianstates = new ArrayList<String>();

		indianstates.addAll(southstates);
		indianstates.addAll(0, northstates);

		northstates.clear();
		southstates.remove(2);

		southstates.set(1, "TS");
		// contains,indexof,lastindexof,get,sublist

		// southstates.contains("TS");
		System.out.println(southstates.contains("TS"));
		//

		System.out.println(southstates.indexOf("KR"));
		//

		System.out.println(southstates.indexOf("AP"));

		System.out.println(southstates.lastIndexOf("TS"));
		//
		indianstates.add("AP");

		System.out.println(indianstates.lastIndexOf("AP"));

		System.out.println(indianstates.get(5));

		System.out.println(indianstates.subList(2, 5));
		
		//Iterator:To get the element one by one from arraylist object.
		//hasnext:can return boolean.True if there is any next element to the loop.
		//next: Can return the next element to the loop.

		Iterator iterator = indianstates.iterator();
		String statecode = "";
		while (iterator.hasNext()) {
			statecode = (String) iterator.next();
			System.out.println(statecode);
		}

		System.out.println("Befor sorting: "+southstates);
		Collections.sort(southstates);
		System.out.println("After sorting: "+southstates);

	}
}
