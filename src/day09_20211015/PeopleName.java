package day09_20211015;

public class PeopleName {

	public static void main(String[] args) {
		//기본 생성자를 활용한 People 클래스 객체 선언
		People p1 = new People(); //=> 생성자 사용
		
//		People(선언할 클래스 이름, 같아야한다.) p1(객체(인스턴스)) = new People();
		//People p1 => 클래스 타입의 변수 p1 
		// 기본형 = int, double,long, boolean
		//참조형(객체) = String -> 이제 무한대라고 생각하면된다.-> 우리가 만들어서 사용할 수 있다.
		//People();=>생성자(어떤 형태로 객체를 생성할 것인지, 생성자 형식)
		// 기본생성자 => 별도의 선언이 없어도 사용 가능
	
		//필드 활용
		// p1 객체의 name 필드에 이름1 이라는 데이터 저장
		System.out.println(p1.name);
		p1.name = "이름1";
		System.out.println(p1.name);
		
		People p2 = new People();
		p2.name = "이름2";
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		System.out.println(p2.age);
		p1.nation="대한민국";
		System.out.println(p1.nation);
		System.out.println(p2.nation);
		
		//매개변수가 있는 생성자를 활용한 객체 생성
		//매개값으로 필드값 지정
		People p3 = new People("이름3", 11 ,"스위스");
		//"이름3", 11 ,"스위스" => 매개값
		
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.nation);
		
		People p4 = new People("이름4",22);
		People p5 = new People(33,"호주");
		//People p6 = new People("이름5");
	}

}
