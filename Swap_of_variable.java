package java_overview_topic;

import java.util.Scanner;

public class Swap_of_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to Store 2 variable using swapof variable
		//integer datatpes
		int a =123;
		int b=908;
		int temp=768;
		a=b;
		b=temp;
		temp=a;
		System.out.println("This my a value :"+a);
		System.out.println("This my b value :"+b);
		System.out.println("This my temp value :"+temp);
		
		System.out.println("");
		
		//how to Store 4 variable using swap of variable
		String name1="Aishu";
		String empname="sai";
		String details="234a ,xxx";
		String Address="A86858s";
		String temp1="xx";
		name1=empname;
		empname=details;
		details=Address;
		Address=temp1;
		temp1=name1;
		
		System.out.println("This my a name1 :"+name1);
		System.out.println("This my b empname :"+empname);
		System.out.println("This my temp details :"+details);
		System.out.println("This my temp Address :"+Address);
		System.out.println("This my temp temp1 :"+temp1);
		
		System.out.println("");
		/* main keyword scanner 
		 * int datatypes menas ---> nextInt()
		 * String dattypes means ---> nextline()
		 */
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("This my userinput integer datatypes ");
		int dasid=scanner.nextInt();
		System.out.println("This my userinput data for dasid details : "+dasid);
		
		scanner.nextLine();
		System.out.print("This my userinput Reference datatypes ");
		String address=scanner.nextLine();
		System.out.println("This my userinput data for address details : "+address);
		
		scanner.nextLine();
		System.out.print("This my userinput true or false condition  ");
		boolean Boolean=scanner.nextBoolean();
		System.out.println("This my userinput data for Boolean details : "+Boolean);
				
	}

}
