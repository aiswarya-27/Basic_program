package java_overview_topic;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arrray is contain multi value in single variable
		int num[]= {1,2,25,8,9,50};
		//10 to 15 line this for your reference notes , not mandatory code also
	    num[0]=1;
		num[1]=2;
		num[2]=25;
		num[3]=8;
		num[4]=9;
		num[5]=50;
		System.out.println("This my array statement of num 5 value:"+num[5]);
		System.out.println("This my array statement of num 3 value:"+num[3]);
		 // Printing array elements using a for loop
      for (int i = 0; i < num.length; i++) {
           System.out.print(num[i] + " ");
    }
      System.out.println("");
        
      // here i have passing 2 array
        double num1[][]= {
        		{12.90,78,0},
        		{67.9,56,90}
        };
        //out side loop line number 29
        for (int i=0 ; i<num1.length;i++) {
        	//inside loop line number 31
        	for (int j=0; j<num1[i].length;j++) {
            	System.out.print(num1[i][j]);
        	}
        	System.out.println("");
        }
        
        }
      
   }

