package day12_20211020_02;

import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		//Student 객체를 담을 수 있는 ArrayList 선언
		
		List<Student> studentList = new ArrayList<>();
		
		//Student 선언
		Student stu1 = new Student();
		stu1.name = "학생1";
		stu1.age= 22;
		stu1.studentNumber = "20131342";
		
		Student stu2 = new Student("학생2", 20 , "20133333");
		
		//Student 객체를 list에 저장
		studentList.add(stu1);
		studentList.add(stu2);
		
		
		//Student 객체가 가지고 있는 필드값 출력
		System.out.println(studentList.get(0).name);
		System.out.println(studentList.get(0).toString());
		System.out.println(studentList.get(1).name);
		
		//sut1이 가지고 있는 (즉, 0번 인덱스에 담긴) view()메서드 호출
		studentList.get(0).view();
		
		//studentList에 담긴 st2의 이름 변경
		studentList.get(1).name="학생2 이름변경";
		
		//foreach로 출력해보기 => 변수가 리스트에있는 요소요소에 순차적으로 접근
		for(Student s: studentList) {
			System.out.println(s.name);
		}
		
		//for
		for(int i =0; i<studentList.size(); i++) {
			System.out.println(studentList.get(1).name);
			System.out.println(studentList.get(1).toString());
			studentList.get(1).view();
		}
		
		
	}

}
