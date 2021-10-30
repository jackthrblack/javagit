package day06_20211012;

import java.util.Scanner;

public class Ex2_WhileEx2 {

	public static void main(String[] args) {
		// 정수를 입력하고 마지막에 0을 입력하세요.
		// 입력 받은 숫자의 갯수 구하기
		// 입력 받은 숫자 평균 구하기

		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");

		int sum = 0;
		int count = 0;
		int num = scan.nextInt();
		double avg = sum/count; //정수결과를 실수에 대입해서 .0만 붙음
		double avg1 =(double) sum/count; //실수계산 결과를 실수변수에 대입(소수점 이하 값 있음.)
		int avg2 = sum / count; // 정수결과를 정수데 대입해서 몫만.
		do {
			
			if(num==0) {
				break;
			}sum+=num;
			count++;
			num=scan.nextInt();
		} while(num != 0);
			System.out.println("입력한 수는 " + count + "개");
			System.out.println("평균은 "+(sum/count) +"입니다.");

//		while (true) {
//
//			int num = scan.nextInt();
//			
//			if (num != 0) {
//				sum+=num;
//				count++;	
//			}else if(num==0) {
//				break;
//			}
//		}System.out.println("입력한 수는 " + count + "개");
//		System.out.println("평균은 " + (sum / count) + "입니다.");
	}
}

// 내가 헤맨 이유
//1. do while일 경우 아직 해답을 찾지 못햇다...
//스캐너를 두번해야한다.
// 스캔을 반복문 밖에서 할 경우 한 번 들어오고 다시 반복되지 않는다.
// do while에 들어가기 전에 한 번 
//2. while을 쓴 경우
// 	-> 프린트를 계속해서 와일문 안에 둘어서 값 하나 하나의 프린트가 되었다.
// -> 전체적인걸 출력 할 때는 계속해서 말하지만 와일문 밖에서 하는 것이다.