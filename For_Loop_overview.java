package java_overview_topic;

public class For_Loop_overview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for(int number1=0;number1<=10;number1++) {
			System.out.println(number1);
		}
		
		System.out.println("");
		String name ="Aishu";
		
		   // Using a for loop to iterate over each character
     for (int i = 0; i < name.length(); i++) {
           System.out.println("This my name details:"+name);
     }
     System.out.println("");
     
     for (int i = 0; i < name.length(); i++) {
         System.out.println("This my length details:"+i);
   }
     System.out.println("");
     
     for (int i = 0; i < name.length(); i++) {
         System.out.println(name.replace("Aishu","saiaishu"));
         System.out.println(name.toUpperCase());
     }
     
     
     
     System.out.println("");
    
        // Alternatively, using a foreach loop with a char array
      for (char c : name.toCharArray()) {
            System.out.println(c);
        }
			
		
		
		
		
	}

}
