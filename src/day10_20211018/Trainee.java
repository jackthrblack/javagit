package day10_20211018;

public class Trainee {
	
	String name;
	int age;
	String phoneNumber;
	boolean major;
	
	Trainee(String name, int age, String phoneNumber, boolean major){
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this. major=major;
	}
	
	
	Trainee(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void afterSignup(String phoneNumber, boolean major){

		this.phoneNumber=phoneNumber;
		this.major = major;
		
		System.out.println("등록완료");
	}
		
	void phoneNumberUpdate(String updateNumber) {
		this.phoneNumber = updateNumber;
		System.out.println("변경 완료");
	}

}