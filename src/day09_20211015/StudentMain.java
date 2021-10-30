package day09_20211015;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student();
		stu1. name="김백준" ;
		stu1. stuNum="20131342";
		stu1. depart="국제통상학";
		stu1. age=28;
		System.out.println("stu1");
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);
		System.out.println(stu1.depart);
		System.out.println(stu1.age);
		
		 Student stu2 = new Student("김백준", "20131342","국제통상학",28);
		 System.out.println("stu2");
		 System.out.println(stu2.name);
		 System.out.println(stu2.stuNum);
		 System.out.println(stu2.depart);
		 System.out.println(stu2.age);
		 
		 //System.out.println(stu2); //=>주소값만 나온다.
		 
		 Student stu3 = new Student("김백준", "20131342");
		 System.out.println("stu3");
		 System.out.println(stu3.name);
		 System.out.println(stu3.stuNum);
		 
		 Student stu4 = new Student("20131342","국제통상학",28);
		 System.out.println("stu4");
		 System.out.println(stu4.stuNum);
		 System.out.println(stu4.depart);
		 System.out.println(stu4.age);
	}

}
