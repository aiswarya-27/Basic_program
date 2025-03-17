package java_overview_topic;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// String is a reference data type that can store one or more characters
		//reference data type have access to useful methods
		String name ="Aishu      ";
		boolean Boolean =name.equals(name);
		boolean Boolean1 =name.equals("Aishu");
		boolean Boolean2 =name.equals("AISHU");
		boolean Boolean3=name.equalsIgnoreCase("AISHU");
		
		//what are u passing value name
		// a=0,i=1,s=2;
		int result =name.indexOf("s");
		// it change small letter
		String result1=name.toLowerCase();
		
		// it can change Capital letter
		String result2=name.toUpperCase();
		
		// space can remove
		String result3 =name.trim();
		
		//what are u passing value name
		// a=0,i=1,s=2;
		char result4=name.charAt(0);
		
		
		System.out.println(Boolean);
		System.out.println(Boolean1);
		System.out.println(Boolean2);
		System.out.println(Boolean3);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
