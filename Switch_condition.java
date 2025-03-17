package java_overview_topic;

import java.util.Scanner;

public class Switch_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=790;
		  int condition = (age <= 78)? 1 : 2; 
switch(condition){
case 1:
	System.out.println("this my 1 condition is true");
break;
case 2:
	System.out.println("this my 2 condition is false");
break;
default:
System.out.println("Not condition");
}

Scanner scanner = new Scanner(System.in);

System.out.println("Enter employee details:");

System.out.print("Name: ");
String name = scanner.nextLine();

System.out.print("Address: ");
String address = scanner.nextLine();

System.out.print("Phone Number: ");
int phoneNumber = scanner.nextInt();

scanner.nextLine();

System.out.print("Gender: ");
String gender = scanner.nextLine();

System.out.println("\nChoose a detail to display:");
System.out.println("1. Name");
System.out.println("2. Address");
System.out.println("3. Phone Number");
System.out.println("4. Gender");

int choice = scanner.nextInt();

switch (choice) {
    case 1:
        System.out.println("Name: " + name);
        break;
    case 2:
        System.out.println("Address: " + address);
        break;
    case 3:
        System.out.println("Phone Number: " + phoneNumber);
        break;
    case 4:
        System.out.println("Gender: " + gender);
        break;
    default:
        System.out.println("Invalid choice!");
}

scanner.close();
}
	

}
