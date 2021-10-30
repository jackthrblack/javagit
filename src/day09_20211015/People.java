package day09_20211015;

public class People { //혼자서는 아무것도 할 수 없어서 누군가가 호출을해주 사용해줘한다.
					// main 메서드에서 객체를 만들어 사용, main메서드는 하나만 있어야한다.
	//필드 선언
	String name;
	int age;
	String nation="미국"; //=>초기값 선언
	
	// 기본생성자 S/선언 소괄호 안에 아무것도 없는 것.
	People(){
		System.out.println("기본생성자 호출됨.");
	}
	
	// 매개(중간에서 전달)변수가 있는 생성자 선언
	People(String name, int age, String nation){
		System.out.println("생성");
		this.name = name; //아무런 의미가 없다. 
		this.age = age;
		this.nation = nation;
		
		//매개변수 값 확인	
		System.out.println(name);
		System.out.println(age);
		//System.out.println(nation);
		System.out.println("끝");
		
	}//this. 현재 클래스의 필드를 가리킬 때
	//좌변 = this.~ 필드를 가리킴
	
	//매개변수 값 확인
	
	
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
	//People(String name){
		//this.name = name;
	
	// 매개변수 타입 : String, int
	People(int age,String name){
		this.name = name;
		this.age = age;
	
	// 매개변수 타입 : String, int
	//People(int age,String nation){
		this.name = nation;
		this.age = age;
	}//같은 타입이 연달아 오면 생성자 오버로드는 형성이 안된다.
	

}











