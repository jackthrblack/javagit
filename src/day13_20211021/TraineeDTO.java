package day13_20211021;


//DTO(Data Transfer Object)
//VO(Value Object)
public class TraineeDTO {
	private String name;
	private int age;
	private String phoneNumber;
	private boolean major;
	
	//기본생성자
	TraineeDTO(){
		
	}

	//매개변수 생성자
	public TraineeDTO(String name, int age, String phoneNumber, boolean major) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.major = major;
	}
	
	//get, set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isMajor() {
		return major;
	}

	public void setMajor(boolean major) {
		this.major = major;
	}
	
	//toString
	@Override
	public String toString() {
		return "Trainee [name= " + name + ", age= " + age + ", phoneNumber= " + phoneNumber + ", major= " + major + "]";
	}

}
