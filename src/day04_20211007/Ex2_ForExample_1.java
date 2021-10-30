package day04_20211007;
import java.util.Scanner;

public class Ex2_ForExample_1 {

	public static void main(String[] args) {
		// for문을 이용하여 1부터 10까지 합계 구하기
		// 1+2+3+4+5+6+7+8+9+10=55
		
//		int sum = 0;
//		for (int num1 = 1; num1 <= 10; num1++) {
//			sum +=num1;
//			System.out.print(num1);
//			if(num1<10) {
//				System.out.print("+");
//			}else{
//				System.out.print("=");
//			}
//		} 
//		System.out.println(sum);
		
		// 스캐너 활용
		// 시작값 : 10
		// 끝값 : 20
		// 10+~~~~~+20=165
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작값: ");	
		int i = scan.nextInt();
		
		System.out.print("끝: ");
		int e = scan.nextInt();
		
		int sum = 0;
		
		for(int num=i; num<=e; num++) {
			sum+=num;
			System.out.print(num);
			if(num<e) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
		} 
			System.out.println(sum);
	}

}
