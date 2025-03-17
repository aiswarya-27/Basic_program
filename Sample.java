package Basic_program;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sample {
	
// class name should be Upper case (captical letter)in first letter itself : Sample
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
/******
 * Public ---> Access specifier
 * static -->keyword
 * void --> return type
 * main-->mathod name
 * String args[] --> Arrayof String object
 */
		/* Noted
		 * JVM  ---> java virtual mechine --> it is used for the run java program
		JRE  ---->java runtime Environment --> libraries & toolkits
		JDK --> java Development kit( developer tool)---> it contains developers tool help us code as wwll as
		
		 */
		 
		 
		
		
	/* Variable --------> A placeholder for a value that behaves as the value it contain
	 * 
	 * int x  ;    ----> declartion
	 * x= 123 ; ---------> assignment
	 * int ---> datatype  , x---> variable , 123 ---> vaule
	 * int x = 123;   ---> initialization
	 */
		
		/****** Variable program -1***************/
		/*
		int x =123;
		double d = 34.6;
		boolean b= true;
		String s="Hello";
		char c= '@';
		
		System.out.println("This my Primitive data type x value:"+x);
		System.out.println("This my Primitive data type d value:"+d);
		System.out.println("This my Primitive data type b value :"+b);
		System.out.println("This my Reference data type s vaule :"+s);
		System.out.println("This my Primitive data type c value :"+c);
		*/
		
		
		/****** Variable using user input types program-2***************/
		/*
		// we need to import java.util.scanner*;
		Scanner scanner = new Scanner( System.in);
		
	System.out.println("Enter the x Vaule");
	int x=scanner.nextInt();
	System.out.println("This is me Aiswarya:"+x);
	
	
	System.out.println("Enter the y vaule");
	String y = scanner.next();
	System.out.println("This is reference data type y value :"+y);
	
	scanner.nextLine();
	
	System.out.println("Enter the z vaule");
	String z = scanner.next();
	System.out.println("This is reference data type z vaule:"+z);
	
	System.out.println("Enter the d Vaule");
double d=scanner.nextDouble();
	System.out.println("This is  Reference data type:"+d);
	
	scanner.close();
	
		*/
		
		/* what is primitive datatype 
          *eg: int , double,boolean
          *char--> single charcter/ letter /ASCII value ( ex:'f')
          *what is the reference datatype
          eg: string 
		
		int, short,boolean,byte,long -------> only store integer only not store the decimal value( decimal vaule eg: 56.346765)
		*/
		
		
	/******************Swap two variable using Primitive data type program **********/
		/*
		int x= 123;
		int y=678;
		int z;
		
		z=x;
		// first this condition check 
		x=y;
		y=z;
		
		System.out.println("x vaule:"+x);
		System.out.println("y vaule:"+y);
		System.out.println("temp vaule:"+z);
		*/
		
		/******************Swap three variable using Reference data type program **********/
		/*
		String name="Murga";
		String name1="Aissai";
		String name2="Pramila";
		String name3;
		
		//second step excuted this condition
		name3=name;
		
		//first this condition working
		name= name1;
		
		//3rd this condition
		name2=name3;
		
		
		System.out.println("name vaule:"+name);
		System.out.println("name1 vaule:"+name1);
		System.out.println("name2 vaule:"+name2);
		System.out.println("name3 vaule:"+name3);
		
	*/
		/**************** User input using swap two variable************/
		/*
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Enter the x Vaule");
		int x=scanner.nextInt();
		System.out.println("This is Prmitive data type x value:"+x);
		
		
		System.out.println("Enter the d Vaule");
	    int d=scanner.nextInt();
		System.out.println("This is  Primitive data type d vaule:"+d);
		
	System.out.println("Using  temp Variable of swap  four vaule ");
	int y =scanner.nextInt();
	System.out.println("This is  primitive data type y value :"+y);
	
	int temp;
	
	x=d;
	d=y;
	temp=x;

	
	System.out.println("Using  temp Variable of swap  four vaule temp :"+ temp);
	System.out.println("Using  temp Variable of swap  four vaule x :"+ x);
	System.out.println("Using  temp Variable of swap  four vaule d :"+ d);
	System.out.println("Using  temp Variable of swap  four vaule y :"+ y);
	
	scanner.close();
	
	*/
		
		/********* Expression
		 * Operands   = value , variable,number
		 * Operators  = +,-,*,/
		 */
		
		/********** Graphical User Interface*************/
		/*
		// we need import javax.swing,JOptionalpane;
		
		// Reference data type
		String name = JOptionPane.showInputDialog("Enter you name");
		JOptionPane.showMessageDialog(null,"This my name:"+ name);
		
		
		// Primitive data type
		
		int a= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "This my age :"+ a);
		
		double d= Double.parseDouble(JOptionPane.showInputDialog("Enter your hight"));
		JOptionPane.showConfirmDialog(null, "This my hight: "+d);
		
		// Reference data type ( charcter)
		String name1 = JOptionPane.showInputDialog("Enter you any charcter");
		JOptionPane.showMessageDialog(null,"any charcter :"+ name1);
		
		*/
		
		/************If statement( program -1)***************************/
		// perform a block of code if it this condition evaluated to be true
		
		/*
		int a= 67;
	
		if( a>=89) {
			System.out.println("This not equal vaule");
		}else {
            System.out.println("Condition not met, no output inside if block.");
        }
	*/
		/************If statement( program -2)***************************/
		/*
		 int b= 90;
		  // 90<=100
		 if(b<=100) {
			 System.out.println("This correct value of b");
		 }
		 */
		
		/************If statement( program -3)***************************/
		/*
		int c= 78;
		
		if(c>=90) {
			System.out.println("this my c value small");
		}else if( c>=80) {
			System.out.println("This my c value check the condition");
		}else if(c<=90) {
			System.out.println("This correct vaule of c");
		}else {
			System.out.println("In vaild data");
		}
		*/
		
		/************If statement( program -4)***************************/
		/*
		int d = 80;
		
		if(d>=90) {
			System.out.println("this my d value small");
		}else if( d>=800) {
			System.out.println("This my d value check the condition greater then");
		}else if(d>=789) {
			System.out.println("This my d value check the condition ");
		}
		else if(d==80) {
			System.out.println("This correct vaule of d");
		}else {
			System.out.println("In vaild data");
		}
		
		*/
		
				
		/************Logical Operators 
		 * used to connect two or more expressions
		 * &&  --> ( And)  both condition  must be true
		 * ||  ---> (OR) either condition must to true
		 * |! ----> (NOT) Reverse boolean value of a condition
		 */
		
		/********* AND Operators using if and else if statement( program-1) ***********/
		/*
		int a= 78;
		
		if( a>=90) {
			System.out.println("This a value ");
		}else if(a<=90 && a<=89) {
			System.out.println("This both condition true only");
		}
		*/
		
		/********* AND Operators using user input  and if and else if statement( program-2)   
		 * Primitive data type
		 * ***********/
		 /*
		Scanner scanner = new Scanner( System.in);
		System.out.println("This And Operators using the if and else if statemnet condition");
		
		int a= scanner.nextInt();
		
		if( a<=700) {
			
			System.out.println("a value is 700 ");
		}else if( a>=890 && a>=900) {
			System.out.println("Check the both to be true");
		}
		
		System.out.println("This final a value:"+a);
		*/
		
		/********* AND Operators using user input  and if and else if statement( program-3)   
		 * Reference data type and Primitive data type
		 * &&  --> ( And)  both condition  must be true
		 * ***********/
		/*
		Scanner scanner = new Scanner( System.in);
		System.out.println("This And Operators using Primitive data type");
		// Primitive data type
		int a= scanner.nextInt();
		
		if( a<=700) {
			
			System.out.println("a value is 700 ");
		}else if( a>=890 && a>=900) {
			System.out.println("Check the both to be true");
		}else {
			System.out.println("In vaild data");
		}
		
		System.out.println("This final a value:"+a);
	
		scanner.nextLine();
		
		//Reference data type
		System.out.println("This  And opeators using Reference data type");
		
		String name =scanner.next() ;
		
		if(name.equals("Ais") && name.equals("Ais")) {
			System.out.println("This both condition is true");
		}else {
			System.out.println("invaild reference data type");
		}
		
		System.out.println("This final name value:"+name);
		*/
		
		/********* Or Operators using user input  and if and else if statement( program-4)   
		 * Reference data type and Primitive data type
		 * ||  ---> (OR) either condition must to true
		 * ***********/
		/*
		Scanner scanner = new Scanner(System.in);
		
		//Reference data type
				System.out.println("This  OR opeators using Reference data type");
				
				String name =scanner.next() ;
				
				// or operators
				if(name.equals("Ais") || name.equals("AIS")) {
					System.out.println("This both condition is true");
				}else {
					System.out.println("invaild reference data type");
				}
				
				System.out.println("This final name value:"+name);
				
				scanner.nextLine();
				
		System.out.println("This My Primitive data type");
		int a =scanner.nextInt();
		
		
		if(a==89) {
			System.out.println("equal statement");
			// or operators
		}else if( a==800 || a==700) {
			System.out.println("Either one condition , the condition to be true");
		}else {
			System.out.println("InVaild data");
		}
		
		System.out.println("This a value of Primitive data type:"+a);
		
		*/
		
		/********** NOT Operators using user input  and if and else if statement( program-5)   
		 * Reference data type and Primitive data type
		 * |! ----> (NOT) Reverse boolean value of a condition
		 */
		
		/*
		
               Scanner scanner = new Scanner(System.in);
		
		//Reference data type
				System.out.println("This  NOT Operators using Reference data type");
				
				String name =scanner.next() ;
				
				// or operators
				if(!name.equals("Ais") && !name.equals("AIS")) {
					System.out.println("This NOT Operators both condition is true");
				}else if(!name.equals("muruga") && !name.equals("MURGA")) {
					System.out.println("NOT Operators reference data type");
				}else {
					System.out.println("Invaild NOT Operators");
				}
				
				System.out.println("This NOT Operator final name value:"+name);
				
				scanner.nextLine();
				
		System.out.println("This NOT Operator for My Primitive data type");
		int a =scanner.nextInt();
		
		
		if(a==89) {
			System.out.println("equal statement");
			// or operators
		}else if( a==800 || a==700) {
			System.out.println("Either one condition , the condition to be true");
		}else {
			System.out.println("InVaild data");
		}
		
		System.out.println("This a value of Primitive data type:"+a);
		*/
		
		/*************** Nested Loop*********************/
		/*
		int row;
		int column ;
		String c;
		
		Scanner a = new Scanner(System.in);
		System.out.println("This the # row");
		row= a.nextInt();
		
		System.out.println("This is the # column");
		column =a.nextInt();
		
		//a.nextLine();
		
		System.out.println("This is the # Chacter");
		c=a.next();
		
		//outer loop
		for( int i=1; i<=row ;i++) {
			System.out.println(i);
		
			for ( int j=1; j<=column ;j++) {
				System.out.print(c + " "); // Print on the same line with space
			}
			System.out.println(); // Move to the next line after each row
		}
		
		a.close();
		*/
		
		/********* While loop******************/
		/*
		 * Excutes a block of code as long as a it's condition remains true*******/
		/*
		Scanner a= new Scanner(System.in);
		String name ="";
		
		do {
			System.out.println("Enter the your name");
			name =a.nextLine();
		}while(name.isBlank());
		System.out.println("Murga"+" "+name);
		
		
		 Scanner b = new Scanner(System.in);
	        int b1;

	        do {
	            System.out.println("Enter a number (enter 0 to exit):");
	            b1 = b.nextInt();
	        } while (b1 != 0); // Condition to exit the loop when user enters 0

	        System.out.println("Last entered number: " + b1);
	        b.close(); // Close the scanner
		*/
		
		/************** For loop*********/
		/* excutes a block of code a limit amount of  times*******/
		/*
		// increment 
		for(int i=0; i<=10 ;i++) {
			System.out.println(i);
		}
		System.out.println("we will be tcs employee in back end developer"); 
		
		// decrement
		for( int j=10 ;j>=1 ;j--) {
			System.out.println(j);
		}
		*/
		
		/** Switch statement***********************/
		
		/** statement that allow a variable to be tested for equality again a list of value.
		 * The Switch statement can have of possible execution path.
		 * A switch works with the byte,short,char,and int that alos about Primitive data type.
		 * ****************/
		/*
		int num;
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the Primitive data type");
		num =a.nextInt();
		
		
		switch(num) {
		case 1:System.out.println("Enter the number 1");
		break;
		case 2:System.out.println("Enter the number 2");
		break;
		case 3:System.out.println("Enter the number 3");
		break;
		default:System.out.println("In vaild number ");
		}
		 a.close();  // Closing scanner
		 */
		
		
		/** Array ************
		 * used to store multi value in a single variable***/
	/*
		//Primitive data type
		int [] a= {1,6,8,78,905};
		a[3]=567;
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" ");
		
		// Reference data type
		String [] name = {"Ais","Murga","Pramila"};
		System.out.println(name[0]+" "+name[1]+" "+name[2]+" ");
		
		// Reference data type
		String [] b= new String[5];
		b[0]="Ais";
		b[1]="Murga";
		b[2]="Aissai";
		b[3]="Pramila";
		b[4]="Santhima";
		System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]+" "+b[4]);
		
		*/
		
		/*********Array using Reference data type using for loop***********/
		/*
		String [] b1= new String[4];
		b1[0]="Tcs";
		b1[1]="CTS";
		b1[2]="HCL";
		b1[3]="Wipro";
		
		for(int i=0; i<b1.length; i++) {
			System.out.println(b1[i]);
		}
		*/
	
		//how to user input using scanner and for loop statment
/*		
Scanner s= new Scanner( System.in);
System.out.println("This my Primitive data type");
int x=s.nextInt();

s.nextLine(); 

System.out.println("This my Reference data type");
String name1=s.nextLine();

System.out.println("\nKindly print x value:");
System.out.println(x);

System.out.println("\nKindly print name1 value:");
System.out.println(name1);

for(int i=0;i<=x ; i++) {
	System.out.println(i);
	for (int j=0; j<name1.length(); j++) {
		 System.out.println("j: " + j + " -> " + name1.charAt(j));
		//System.out.println(j);
	}
	
}
		
s.close();
	}
}

*/
		
		/************* array List( prgram-1) **************/
		/******* A resizable array. Element can be added or remove after the compilation phases store reference data type*****/
	
		/*****Reference data type***********/
		/*
	//we nedd to import java.arrylist
		ArrayList<String> a=  new ArrayList<String>();
		
		//ArrayList---> only it only first letter Upper case
		
		a.add("Murga");
		a.add("Aissai");
		a.add("pramila");
		
		a.set(0, "I love my god muruga");
		
		// using for loop get data using Arraylist
		
		for(int i=0 ;i<a.size();i++) {
			System.out.println("This my Reference data type i value:"+a.get(i));
		}
		
		System.out.println("");
		
		*/
		
		/************* array List( program-2) **************/
		/*****Primitive data type ***********/
		/*
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(123);
		a1.add(4456);
		a1.add(678);
	
		// set the vaule
		a1.set(2, 89006);
		
		//remove vaule
		a1.remove(2);
		
		//using for loop get data using Arraylist
		for(int i=0 ;i<a1.size();i++) {
			System.out.println("This is my primive Data type:"+a1.get(i));
		}
		*/
		
		/************* array List( program-3) using scanner input and if stamentand and Arraylist **************/
		/*
		Scanner scanner = new Scanner( System.in);
		System.out.println("Primitive data type using array list");
		 int x = scanner.nextInt();
		 System.out.println("Pls enter integer data type here");
		 
		 if(x==89) {
			 System.out.println("kindly check equal value or not");
		 }else if(x==90 || x==50) {
			 System.out.println("Either the both any one condition true mean that true");
		 }else {
			 System.out.println("Invaild Primitive data type");
		 }
		 
		 ArrayList<Integer> x1= new ArrayList<Integer>();
		x1.add(123567);
		x1.add(4456980);
		x1.add(6783578);
		
			// set the vaule
			x1.set(2, 89002486);
			
			//using for loop get data using Arraylist
			for(int i=0 ;i<x1.size();i++) {
				System.out.println("This is my primive Data type:"+x1.get(i));
			}
		 
		 
		 
	}
}

*/
		
/********** Noted : Array
 * []--.> symbol
 * frist we will this import java.array;
 * using for loop( a.length)--> only get reference type vaule ,primitve data type that not working (Eg : a.lenth)
 * eg: 	for(int i=0; i<b1.length; i++) {
			System.out.println(b1[i]);
		}
		
		
 * ArrayList
 * first  we will this import java.arraylist  
 * ( Eg:ArrayList<Integer> x1= new ArrayList<Integer>();)
 * add the value  eg: x1.add(123);
 * using for loop we will get vaule  --->[eg:]   --->for(int i=0 ;i<x1.size();i++) {
				System.out.println("This is my primive Data type:"+x1.get(i));
			}
		 
 */
		
		/********** 2d Array************/ 
		// row and column
	/*
		String a1[][] = {
				{"Ais","sai"},
				{"murga","shivan"}	
				};
		
		System.out.println(a1[0][0]);
		System.out.println(a1[0][1]);
		System.out.println(a1[1][0]);
		System.out.println(a1[1][1]);
		
		System.out.println();
		
		String b2[][] =new String[3][3];
		b2[0][0]="TCS";
	    b2[0][1]="Accenture";
	    b2[0][2]="Tech Mahindra";
		b2[1][0]="Wipro";
		b2[1][1]="Atos";
		b2[1][2]="cognizant";
		b2[2][0]="amazon";
		b2[2][1]="Zoho";
		b2[2][2]="Filkart";
		
		
		for( int i=0; i<b2.length; i++) {
			System.out.println();
			for(int j=0;j<b2[i].length;j++) {
				System.out.println(b2[i][j]);
			}
		}
		
		
		int a[] []= {
				    {1,2,3,4},
				    {5,6,7,8}
		           };
		
		System.out.println(a[0][0]+ " "+a[0][1]+" "+a[0][2]+" "+a[0][3]);
		System.out.println(a[1][0]+ " "+a[1][1]+" "+a[1][2]+" "+a[1][3]);
		
		//out side loop
		for( int i=0 ; i<a.length ;i++) {  // Iterating through rows
			System.out.println("This is the  i value row:"+i);
			//inner loop
			for(int j=0; j<a[i].length;j++) {  // // Iterating through columns
				System.out.println("This is the i value of column :"+a[i][j]);
			}
		}
		System.out.println(); // Move to the next line after each row
		}
		}
		
		*/
		
		/************ 2D ArrayList*************/
		/*
		ArrayList<ArrayList<String>> a =new ArrayList<ArrayList<String>>();
		
		
		ArrayList<String> b= new ArrayList<String>();
		b.add("abc");
		b.add("AVHHI");
		
		ArrayList<String> c= new ArrayList<String>();
		c.add("A868582");
		c.add("Muruga");
		
		ArrayList<String> d= new ArrayList<String>();
		d.add("@@@@@@@@@@");
		d.add("&&&&&&&&");
		
				
		a.add(b);
		a.add(c);
		a.add(d);
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		
		
		for(int i=0; i<a.size();i++) {
			for(int j=0; j<a.get(i).size();j++) {
				System.out.println("This my i and j value:"+a.get(i).get(j));
			}
		}
		System.out.println("");
		*/
		
		
		/************* Method*****************/
		// it is a block of code that excuted wherever it is called upon
		/*
		String name="Ais";
		int num=123;
		double d=67.3;
		
		//method name :sample
		 // argument 
		sample(name, num, d);
	}

		//parameter name : (String name, int num,double d)
		static void sample(String name, int num,double d) {
			System.out.println("This my name:"+name);
			System.out.println("This my num:"+num);
			System.out.println("This my double:"+d);
		}
}
		
		*/
		
	   	/************** method using the scanner ********************/
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("this my Reference data type using the method");
		String name1= scanner.next();
		
		scanner.nextLine();
		
		System.out.println("This my Primitive data type the method");
		int num=scanner.nextInt();
		
		System.out.println("This my Primitive dat type using double value in method");
		double d=scanner.nextDouble();
		
		  // Calling the method
		   // method name sample1
        String result = sample(name1, num, d);
        System.out.println("Method Output: " + result);

        scanner.close();
    }

	  // Corrected method with a return type of String
    static String sample(String name1, int num, double d) {
        return name1 + " " + num + " " + d;
    }
}
	*/
		
		/*************Overloaded Method ( using scanner)*******************/
		/**** methods that share the same name but have different parameters
		 * method name + parameters = method signature
		 * ********/
		/*
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("this my Reference data type using the Overloaded method");
		String name1= scanner.next();
		
		scanner.nextLine();
		
		System.out.println("This my Primitive data type the Overloaded method");
		int num=scanner.nextInt();
		
		System.out.println("This my Primitive data type using double value in Overloaded method");
		double d=scanner.nextDouble();
		
		System.out.println("This my Primitive data type using Charcter in Overloaded method");
		 char character = scanner.next().charAt(0); // Read only one character
		
		  // Calling the overloaded method
	        String result = sample1(name1, num, d, character);
	        System.out.println("Method Output: " + result);

        scanner.close();
        
	}
		
		// call the Overloaded method here
		static String sample1(String name1) {
			return name1;
		}
		
		static String sample1(String name1,int num) {
			return name1+" "+num;
		}
		
		static String sample1(String name1,int num,double d) {
			return name1+" "+num+" "+d;
		}
		static String sample1(String name1,int num,double d,char Char) {
			return name1+" "+num+" "+d+" "+Char;
		}
		
		
}
*/
		
		/************* Constructor**************/
		/********* special method that is called when object is instantiated(created)***********/
/*
		public class Sample {
			
			 // Attributes (Removed 'static' to ensure they are object-specific)
		    String name;
		    int num;
		    
		    
	// Constructor name should in Upper case only
	Sample(String name,int num){
		this.name= name;
		this.num= num;
	}
	 // Method to display the number
    void test() {
        System.out.println("Number: " + num);
    }

    // Method to display the name
    void model() {
        System.out.println("Kindly enter the name: " + name);
    }
	
	// class name should be Upper case (captical letter)in first letter itself : Sample
	
	public static void main(String[] args) {
Sample a= new Sample("Aiswarya",123);

Sample a1= new Sample("Aiswaryasai",123456);
Sample a2= new Sample("AiswaryaMurga",25);

a.test();
a.model();

a1.test();
a1.model();

a2.test();
a2.model();

}
	}
	*/	
		
		 
		/*************** Constructor Overloaded****************/
		// multi constructor within a class	with same method name and but  have differnce paramters
// keyword : this
// constructor name and class name should be same only.it should be upper calss only
/*
public class Sample {
	
	 // Attributes (Removed 'static' to ensure they are object-specific)
   String name;
   int num;
   double d;
   char c;
   
   
// Constructor name should in Upper case only
   
   Sample(String name){
	   this.name= name;
	   }
   
Sample(String name,int num){
this.name= name;
this.num= num;
}


Sample(String name,int num,double d){
this.name= name;
this.num= num;
this.d=d;
}


Sample(String name,int num,double d,char c){
this.name= name;
this.num= num;
this.d=d;
this.c= c;
}

// class name should be Upper case (captical letter)in first letter itself : Sample

public static void main(String[] args) {
	//argument we need pass the vaule
Sample a= new Sample("Aiswarya",123,56.2,'*');

Sample a1= new Sample("Aiswaryasai",123456,3.14,'@');
Sample a2= new Sample("AiswaryaMurga",25,67.3,'#');

System.out.println(a.name+" "+a.num+" "+a.d+" "+a.c);
System.out.println(a1.name+" "+a1.num+" "+a1.d+" "+a1.c);
System.out.println(a2.name+" "+a2.num+" "+a2.d+" "+a2.c);


}
}
*/

/************** String method************/
		// string -->Reference data type can store one or more charcter 
		// references  data typed have access uesful method
		/*
		String name ="Aiswarya";
		//boolean result =name.equals(name);
		boolean result= name.equals("Aiswarya");
		boolean result1 =name.equals("Murga");
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println("");
		
		String namesample ="Aiswarya";
		boolean resultsample= namesample.equalsIgnoreCase("aiswarya");
		boolean resultsample1 =namesample.equalsIgnoreCase("Murga");
		System.out.println(resultsample);
		System.out.println(resultsample1);
		
		System.out.println("");
		
		String a="Murga_Child_Of_Aiswarya";
		int i=a.length();
		int i1=a.indexOf(0);
		System.out.println("This length of a vaule:"+i);
		System.out.println("This index of a vaule:"+i1);
		
		System.out.println("");
		
		String b="Murga";
		char c=b.charAt(2);
		String b1=b.toUpperCase();
		String b2=b.toLowerCase();
		
		System.out.println("this is 2 letter of b vaule: "+c);
		System.out.println("This is upper case of the b  reference data type:"+b1);
		System.out.println("This is Lower case of the b  reference data type:"+b2);
		
		System.out.println("");
		
		
		String string = "       Sample";
		String c1=string.trim();
		System.out.println(c1);
		
	}
}
*/
		
		
		/**************** tostring method*****************/
		// special method that all object inherits
		//that return string that " texually represented " on object
		//can be used implicitly and explicitly
		
	
		Sample s= new Sample();
		// Explicitly
		//System.out.println(s.toString());
		// Implicitly
		System.out.println(s);
		
		
	}
	
	int age=123;
	double d=89.7;
	char c='#';
	
	public String toString() {
		return age+"\n"+d+"\n"+c;
	}
	
}
	
	
		