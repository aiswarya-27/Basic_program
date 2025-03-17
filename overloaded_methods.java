package java_overview_topic;

public class overloaded_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add = totest(1223, 567); // Call the static method
        System.out.println(add);
        
        System.out.println("");
        
        String sample =tostring("Aishu","sai","Female");
        System.out.println(sample);
	}
static int totest(int age) {
		System.out.print("Age:"+age);
		return age;
	}
static int totest(int age,int epmid) {
		System.out.print("this my int data types 2 test");
		return age+epmid;
	}

	
 static int totest(int age,int epmid,int dasid) {
		System.out.println("dasid:"+dasid);
		return age+epmid+dasid;
	}
 
 static String tostring(String name, String address) {
	 System.out.println("This my string data types address:"+address);
	return address;
	 
 }
 static String tostring(String name, String address,String gender) {
	 System.out.println("This my string data types gender:"+gender);
	return gender;
}
}
