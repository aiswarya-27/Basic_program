package java_overview_topic;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> number =new ArrayList<String>();
		//number : object name
		 number.add("Aishu");
		 number.add("sai");
		 number.add("murugan");
		 
		 number.set(0, "Aishusai");
		 
		 for (int i =0; i<number.size();i++) {
			 System.out.println(number.get(i));
			 
		 }
		 
	 ArrayList<Integer> number1 = new ArrayList<>();

		 
		 number1.add(123);
		 number1.add(789);
		 
		 for(int j=1;j<number1.size();j++) {
			 
			 System.out.println("this my number1:"+number1.isEmpty());
		 }
		 
		 
		 ArrayList<Integer> number2 = new ArrayList<>();
	 number2.add(123);
		 //number2.add(null);
 
		 
 // Printing whether number2 is empty and its values

 
 for (int j = 0; j < number2.size(); j++) {
     System.out.println("number2 value at index " + number2.get(j));
 }
		
	
	}

}
