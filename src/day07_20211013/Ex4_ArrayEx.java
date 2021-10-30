package day07_20211013;

import java.util.Scanner;

public class Ex4_ArrayEx {

	public static void main(String[] args) {
		// 크키가 5인 정수형 배열 선언
		// 스캐너로 값을 받은 뒤
		//입력받은 값 중에서 가장 큰 값을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		int max = 0;
		for(int i = 0; i<num.length; i++) {
			num[i]=scan.nextInt();
			if(num[i]>max) {
				max = num[i];
			}
		}System.out.println(max);
	}
}

//헤맨 이유
//1. 최대값을 담을 변수를 만들어야 한다.
//2. if 조건식의 부등호를 잘 선택하지 못 했다.
