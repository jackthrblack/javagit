package day09_20211015_2;

public class CalculatorMain {

	public static void main(String[] args) {
		// 덧셈
		int num1 = 10;
		int num2 = 20;
		int sum = 0;
		sum=num1+num2;
		System.out.println(sum);
		
		//덧셈 수행하기 위한 메서드만 호출하는 코드로
		Calculator cal1 = new Calculator();
		//add1 메서드 호출
		//cal1.add1();
		// 리턴 데이터를 변수에 저장하기
		int result =0;
		result = cal1.add1();
		System.out.println(result);
		//리턴 데이터를 바로 출력하기
		System.out.println(cal1.add1());
		
		
		//add2 메서드 호출
		result = cal1.add2(num1, num2);
		num1 =12; 
		num2=34;
		System.out.println(result);
		System.out.println(cal1.add2(55, 100));
		
		//리턴이 없는 메서드 호출
		cal1.add3(); //=> 리턴이 없어서 호출만해도 괜찮다.
		
		result = cal1.add3(); //=> 줄게 없어서 오류
		
		//add4호출
		cal1.add4(num1, num2);
		cal1.add4(400,556);
		result = cal1.add4(50,65);
		System.out.println(cal1.add4(50,100));
	}

}
