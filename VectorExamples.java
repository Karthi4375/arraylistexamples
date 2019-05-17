import java.util.*;

public class VectorExamples {

	public static void main(String[] args) {
		
		Vector<String> vector1 = new Vector<String>();
				
		vector1.add("AP");
		vector1.add("TS");
		vector1.add("KR");		
		vector1.add("KA");		
		vector1.add("TN");	
		vector1.add("KR");		

		
		System.out.println("The added elements are :"+vector1);
		
		vector1.add(2, "MP");
		System.out.println("The new elements are :"+vector1);
		System.out.println("KR is at the index of: "+vector1.indexOf("KR"));
		
		Vector<String> vector2 = new Vector<String>();
		
		vector2.addAll(vector1);
		System.out.println("The vector2 elements are :"+vector2);

		vector2.clear();
		System.out.println("vector2 after clearing: "+vector2);
		
		System.out.println(vector1.indexOf("KR"));

		vector1.remove(4);
		System.out.println(vector1);
		
		System.out.println(vector1.contains("KA"));
		
		System.out.println(vector1.lastIndexOf("KR"));
		
		System.out.println(vector1.get(1));
		
		System.out.println(vector1.subList(1,3));
		
		
		Iterator<String> iterator = vector1.iterator();
		String statecode ="";
		while(iterator.hasNext()) {
			statecode = (String) iterator.next();
			System.out.println(statecode);
		}
		
		System.out.println("Befor sorting: "+vector1);
		Collections.sort(vector1);
		System.out.println("After sorting: "+vector1);



				
	}

}
