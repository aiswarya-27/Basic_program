package java_overview_topic;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Arraylist_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> NumberResult = new ArrayList<>();

		ArrayList<Integer> number = new ArrayList<>();
		number.add(123);
		number.add(456);
		
		
		ArrayList<Integer> number2 = new ArrayList<>();
		number2.add(56);
		number2.add(78);
		
		NumberResult.add(number);
		NumberResult.add(number2);
		
		System.out.println(NumberResult);
		System.out.println("");
		
		
		List<List<String>> FinalResult = new ArrayList<>();
		
		List<String> string1 = new ArrayList<>();
		string1.add("Aishu");
		string1.add("Sai");
		
		List<String> string2 = new ArrayList<>();
		string2.add("Murugan");
		string2.add("Shivan");
		
		List<String> string3 = new ArrayList<>();
		string3.add("Pramila");
		string3.add("Shenthi");
		
		FinalResult.add(string1);
		FinalResult.add(string2);
		FinalResult.add(string3);
		
		System.out.println(FinalResult);
		System.out.println("");
		
		
		ArrayList<ArrayList<String>> sampleresult = new ArrayList<>();
		
		ArrayList<String> number1 =new ArrayList<String>();
		//number : object name
		 number1.add("aaa");
		 number1.add("bbb");
		 number1.add("ccc");
		
		ArrayList<String> number21 =new ArrayList<String>();
		//number : object name
		 number21.add("xx");
		 number21.add("yy");
		 number21.add("zz");
		 
			ArrayList<String> number11 =new ArrayList<String>();
			//number : object name
			 number11.add("sample1");
			 number11.add("sample2");
			 number11.add("sample3");
			 
			 sampleresult.add(number1);
			 sampleresult.add(number21);
			 sampleresult.add(number11);
			 
		
		
			 for (int i = 0; i < sampleresult.size(); i++) {
		            ArrayList<String> innerList = sampleresult.get(i); // Get the inner list
		            for (int j = 0; j < innerList.size(); j++) {
		                System.out.println(innerList.get(j)); // Print each element
		            }
		        }
	}

}
