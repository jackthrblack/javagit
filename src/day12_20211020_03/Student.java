package day12_20211020_03;

public class Student {
	// 필드 선언
	private String name;
	private int age;
	private String studentNumber;

	//기본생성자
	public Student() {
		
	}
	
	//매개변수가 있는 생성자
	public Student(String name, int age, String studentNumber) {
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}
	
	// private 필드에 값을 대입하고 가져오기 위한 메서드 선언
	// getXxxx(): get메서드, getter => 필드값을 사용할 때(리턴)
	// setXxxx(): set메서드, setter => 필드값을 저장할 때


	// name 필드값을 리턴하는 메서드
	public String getName() {
		return name;
	}

	// name 필드값을 저장하는 메서드
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentNumber=" + studentNumber + "]";
	}

	
	
	
}
