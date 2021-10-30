package day11_20211019;

import java.util.Scanner;

public class CaulculatorMain {

	public static void main(String[] args) {

		Caulculator cual = new Caulculator();
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4. 나눗셈");
			Scanner scan = new Scanner(System.in);
			System.out.print("메뉴선택: ");
			
			int menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				cual.sum(8, 5);
				break;
			case 2:
				System.out.print("뺄셈 숫자 입력: ");
				int num = scan.nextInt();
				int num2 = scan.nextInt();
				cual.subtraction(num,num2);
				break;
			case 3:
				System.out.print("곱셈 숫자 입력: ");
				int num3 = scan.nextInt();
				int num4 = scan.nextInt();
				System.out.println(cual.multiplication(num3,num4));
				break;
			case 4:
				System.out.print("나눗셈 숫자 입력: ");
				int num5 = scan.nextInt();
				int num6 = scan.nextInt();
				System.out.println(cual.division(num5,num6));
				break;
				
			case 5:
				run=false;
				break;
			}
	
		}
		
		
	}

}
