package java_overview_topic;

import java.util.Scanner;

public class nested_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Check the nested loops");
int num =scanner.nextInt();
System.out.println("This my integer data types num:"+num);

scanner.nextLine();

System.out.print("Pls enter the Prmintive data types here");
double Double =scanner.nextDouble();
System.out.println("This my Primitive data tpes of double:"+Double);

scanner.nextLine();

System.out.print("Pls enter the Char data types here");
String Char=scanner.nextLine();
System.out.println("This my Primitive data tpes of double:"+Char);


for(int i=0; i<=num; i++) {
	System.out.println();
}

for(int i1=0; i1<=Double; i1++) {
	System.out.println(Char);
}
	}

}
