package java_overview_topic;

import java.util.ArrayList;
import java.util.List;

public class Foreach_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> sample = new ArrayList<>();
		sample.add("Srikadal");
		sample.add("sriaishu");
		
		for ( String i:sample) {
			System.out.println(i);
		}
		System.out.println("");
		
			ArrayList<Integer> sample1 = new ArrayList<>();
			sample1.add(123);
			sample1.add(789);
			
			ArrayList<Integer> sample2 = new ArrayList<>();
			sample2.add(908);
			sample2.add(67670);
			
			for (int j:sample1) {
				System.out.println("this for each using arraylist j value:"+j);
			}
				for(int k:sample2) {
					System.out.println("this for each using arraylist k value:"+k);
					
			}
				for(int i=0; i<sample1.size();i++) {
					System.out.println("This my sample1 data:"+sample1.get(i));
					
				}
				
				 // Working with a list of lists (if needed)
		        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
		        listOfLists.add(sample1);
		        listOfLists.add(sample2);

		        for (ArrayList<Integer> innerList : listOfLists) {
		            for (int value : innerList) {
		                System.out.println("Inner list value: " + value);
		            }
					
				}
		
			
			
			
	
		
	}

}
