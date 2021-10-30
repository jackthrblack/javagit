package day01_20211001;

public class Ex05_AssignmentOperator {

	public static void main(String[] args) {
		// 정수형 변수 2개를 선언해서 대입연산자 수행결과 산출
		// 대입연사을 할 경우 변수의 값이 바뀐다.
		int num1 = 5, num2 = 3;
		System.out.println("num1: " + num1 + " num2: " + num2);
		System.out.println(num1+=num2);
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		System.out.println(num1-=num2);
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		System.out.println(num1*=num2);
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		System.out.println(num1/=num2);
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		System.out.println(num1%=num2);
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		
	}

}
