package day01_20211001;

public class Ex3_Operator {

	public static void main(String[] args) {
//		연산자(operato)
//		산술연산자
//		+ 덧셈
//		-뺄셈
//		*곱셈
//		/ 나눗셈
//		% 나머지 연산자
		
		// 정수형변수 num1, num2를 각각 선언
		// 초기값은 num1 = 5, num2 = 3 대입
		//+,-,*,/,% 연사자를 사용하여 각각의 연산결과 출력
		//정수와 정수의 결과는 정수
		
		// 정수끼리의 나누기는 몫
//		int num1 = 5;
//		int num2 = 3;
//		System.out.println("+: "+ (num1 + num2));
//		System.out.println("-: "+ (num1 - num2));
//		System.out.println("*: "+ (num1 * num2));
//		System.out.println("/: "+ (num1 / num2)); //=> 값이 1이 나온 이유는 정수형 타입이다. 
//		System.out.println("%: "+ (num1 % num2));
		// System.out.println("+: "+ num1 - num2);가 오류가 나는 이유
		// System.out.println("+: "+ num1 *,/,% num2); => 우선수위로서 먼저 +,/,%를 먼저 실행.
		// => 이렇게 할 경우 컴퓨터는 앞에 있는 +를 계산식이 아니라 연결시킨다는걸로 인식을하고 계산식으로 다시 하라니깐 오류가 난다.
		//String에서 -(대시)가 갖고 있는 의미는 없다.
		// => 이렇게 표현하고 싶을경우 계산식에 ()를 꼭 해줘야한다.
		
		// 계산결과를 담는 변수 활용
//		int resutle = 0; //=> 0을 쓰는 이유는 아무값이 없을때 쓴다.
//		resutle = num1 + num2;
//		System.out.println("num1 + num2: " + resutle);
//		resutle = num1 - num2;
//		System.out.println("num1 - num2: " + resutle);
//		resutle = num1 * num2;
//		System.out.println("num1 * num2: " + resutle);
//		resutle = num1 / num2;
//		System.out.println("num1 / num2: " + resutle);
//		resutle = num1 % num2;
//		System.out.println("num1 % num2: " + resutle);
//		
//		resutle = num1 + num2;
//		resutle = num1 - num2;
//		resutle = num1 * num2;
//		resutle = num1 / num2;
//		resutle = num1 % num2;
//		System.out.println("num1 + num2: " + resutle);
//		System.out.println("num1 - num2: " + resutle);
//		System.out.println("num1 * num2: " + resutle);
//		System.out.println("num1 / num2: " + resutle);
//		System.out.println("num1 % num2: " + resutle);
//	//=> 변수는 덮어씌기가 가능하기 때문에 최종적으로 선언한 변수의 값을 사용한다.
//	//=> 위의 식을 제대로 하고싶으면
//		int resutle1 = num1 + num2;
//		int resutle2 = num1 - num2;
//		int resutle3 = num1 * num2;
//		int resutle4 = num1 / num2;
//		int resutle5 = num1 % num2;
//		System.out.println("num1 + num2: " + resutle1);
//		System.out.println("num1 - num2: " + resutle2);
//		System.out.println("num1 * num2: " + resutle3);
//		System.out.println("num1 / num2: " + resutle4);
//		System.out.println("num1 % num2: " + resutle5);
//		//=>이렇게 개별적으로 선언을 해줘야한다.
		
		//String 변수간의 + 역할
		String strVar1 = "오늘은 ";
		String strVar2 = "금요일 입니다. ";
		System.out.println(strVar1+strVar2);
		
		String strVar3 =strVar1+strVar2;
		System.out.println(strVar3);
	
		String strVar4 = strVar1 + "10월 1일 입니다.";
		System.out.println(strVar4);
		
		// String 클래스에서 제공하는 length() 메서드 호출
		// length(): String 변수의 길이값(글자수)을 알려줌. => 공백도 한 글자로 취급한다. 모든 문자를 다 한 글자로 취급
		System.out.println(strVar1.length()); //4
		System.out.println(strVar2.length()); //9
		
		String strVar5 = "안녕친구들~!@#@!$#@!$ ";
		System.out.println(strVar5.length()); //9
	}

}
