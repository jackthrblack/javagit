package day01_20211001;

public class Ex04_CompareOperator {

	public static void main(String[] args) {
		/*
		 * num1 = 7, num2 =3
		 * <, >, <=, >=, ==, != 결과출력
		 */
		
		int num1 = 7, num2 =3;
		System.out.println(num1<num2); //false
		System.out.println(num1>num2); //true
		System.out.println(num1<=num2); //false
		System.out.println(num1>=num2); //true
		System.out.println(num1==num2); //false
		System.out.println(num1!=num2); //true
		
		//결과에 변수 담기
//		int resutle = 0;
//		resutle = num1<num2; => 우변은 boolean, 좌변은 int bool타입을 정수형에 대입x -> 타입불일치
		boolean resutle = false;
		resutle = num1<num2;
		System.out.println(resutle);
		resutle = num1>num2;
		System.out.println(resutle);
		resutle = num1<=num2;
		System.out.println(resutle);
		resutle = num1>=num2;
		System.out.println(resutle);
		resutle = num1==num2;
		System.out.println(resutle);
		resutle = num1!=num2;
		System.out.println(resutle); 
		
	}

}
