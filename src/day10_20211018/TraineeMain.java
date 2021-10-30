package day10_20211018;

public class TraineeMain {

	public static void main(String[] args) {
		
		Trainee newStudent = new Trainee("김백준", 28, "01049050299",false);
		System.out.println(newStudent.name);
		System.out.println(newStudent.age);
		System.out.println(newStudent.phoneNumber);
		System.out.println(newStudent.major);
		
		
		
		Trainee newStudent2 = new Trainee("kf",94);
		System.out.println(newStudent2.name);
		System.out.println(newStudent2.age);
		System.out.println(newStudent2.phoneNumber);
		System.out.println(newStudent2.major);
		
		newStudent2.afterSignup("20",true);
		System.out.println(newStudent2.name);
		System.out.println(newStudent2.age);
		System.out.println(newStudent2.phoneNumber);
		System.out.println(newStudent2.major);
		
		newStudent.phoneNumberUpdate("56456");
		System.out.println(newStudent.name);
		System.out.println(newStudent.age);
		System.out.println(newStudent.phoneNumber);
		System.out.println(newStudent.major);
		
	
	}

}