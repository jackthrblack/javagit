package day12_20211020_03;

import java.util.*;
public class StudentMain {
	public static void main(String[] args) {
		// Student 객체를 담을 수 있는 ArrayList 선언
		
		List<Student> studentList = new ArrayList<>();
		
		Student stu1 = new Student();

		//stu1 객체의 name 필드값을 저장
		// stu1.name="학생1";
		stu1.setName("학생1");

		// stu1 객체의 name 필드값 출력
		// System.out.println(stu1.name);
		System.out.println(stu1.getName());
		
		stu1.setAge(22);
		stu1.setStudentNumber("564664");
		
		// stu1 객체를 studentList에 저장
		studentList.add(stu1);
		System.out.println(studentList.get(0).getName());
		Student stu2 = new Student("학생20", 20, "67895460");
		
		studentList.add(stu2);
		
		//for문을 사용하여 studentNumber 출력
		for(int i = 0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i).getStudentNumber());
			System.out.println(studentList.get(i).toString());
			System.out.println(studentList.get(i));
		}
		
		//foreach
		for(Student s : studentList) {
			System.out.println(s.getStudentNumber());
			System.out.println(s.toString());
			System.out.println(s);
		}

	}
}