package java_overview_topic;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hello();
		String add=tomethod(123,"Aishu");
		System.out.println("this is my String data types to call the my method name:tomethod() :"+add);
		
		int add1=tosample(123,890);
		System.out.println("this is my String data types to call the my method name:tosample() :"+add1);
		
	}

	static void  hello() {
		System.out.println("data insert success");
	}
	   // Method that accepts parameters and returns an integer
    public static String tomethod(int number, String dasid) {
        System.out.println("Number: " + number);
        System.out.println("Dasid: " + dasid);
        return number+"\n"+dasid;// Example logic: Return number + length of dasid
    }
    
    public static int tosample(int age,int empid) {
    	System.out.println("Age:"+age);
    	System.out.println("EmpId:"+empid);
		return empid;
    }
}
