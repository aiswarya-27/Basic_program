package java_overview_topic;

public class if_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if statement and else id condition
		int age =100;
	
		if(age<=90) {
			System.out.println("This my true condition");
		}else {
			System.out.println("This my false condition");
		}

		System.out.println("");
		//int age1 =70;
		//int age1 =70  ; if (age>=56) this 1 condition statistic
		//int age1 =70  ; if (age<=56) this 2condition statistic
		int age1 =67;
		if(age1<=56) {
			System.out.println("This my operators 1condition true");
			
		}else if(age1==89) {
			System.out.println("This same value 2 condition");
		}else if(age1<=90) {
			System.out.println("This same value 3 condition");
			
		}else if(age1==100) {
			System.out.println("This same value 4 condition");
			
		}else {
			System.out.println("this not equal condition");
		}
		
		
	}

}
