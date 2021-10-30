package day09_20211015;

public class Student {

	String name ;
	String stuNum;
	String depart;
	int age;

	Student() {
		
	}

	Student(String name, String stuNum, String depart, int age) {
		this.name = name;
		this.stuNum = stuNum;
		this.depart = depart;
		this.age = age;
	}

	Student(String name, String stuNum) {
		this.name = name;
		this.stuNum = stuNum;
	}
	
	Student(String stuNum, String depart, int age) {
		this.stuNum = stuNum;
		this.depart = depart;
		this.age = age;
	}
}
