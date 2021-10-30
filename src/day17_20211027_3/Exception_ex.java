package day17_20211027_3;

import java.util.*;
public class Exception_ex {

	public static void main(String[] args) {
		/*
		 * 정수간의 나눗셈을 할 때 b가 0이 오면 발생하는 예외를 확인하고
		 * 예외처리하는 코드를 작성해보세요
		 * 예외 발생시 0으로 나눌 수 없습니다 출력.  
		 */
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		try {
			System.out.println(a/b);
			String c =null;
			System.out.println(c.equals("bb"));
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		} catch(NullPointerException e) {
			System.out.println("NPE발생");
		} catch(Exception e) { //모든 예외를 나타내기 때문에 Exception이 다른 예외보다 위에 있을경우 밑에 세부적인 예외들은 오류가 난다.
			System.out.println("Arith, Null, 제외한 Exception 발생");
		}
	
		
	}

}
