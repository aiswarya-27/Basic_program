package java_overview_topic;

import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner scanner =new Scanner(System.in);

System.out.print("Enter the empid details");
String empid =scanner.nextLine();
System.out.println("This is my empid :"+empid);


System.out.print("Enter the age details");
int age =scanner.nextInt();
System.out.println("This is my age details :"+age);

System.out.print("Enter the double details");
double Double=scanner.nextDouble();
System.out.println("This my details for double value: "+Double);

scanner.close();

	}

}
