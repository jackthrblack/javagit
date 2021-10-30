package day07_20211013;

import java.util.Scanner;

public class Ex7_ArrayEx {

	public static void main(String[] args) {
		// 거스름돈 계산하기
		Scanner in = new Scanner(System.in);

		int[] coin = { 500, 100, 50, 10 };
		int money = in.nextInt();

		for (int i = 0; i < coin.length; i++) {
			
			//System.out.println(coin[i] + "원" + " " + money / coin[i] + "개");
			if (money / coin[i] > 0) {
				money%=coin[i];
				System.out.print(coin[i]+ "원" + " " + money / coin[i] + "개");
			}//System.out.print(coin[i]+ "원" + " " + money / coin[i] + "개");
		}

	}

}

//헤맨 이유
//1. 거스름돈 표시를 어떻게할지 고민
//2. 프린트 출력 문구를 이상한 곳에다 써서 계속해서 이상한 값이 나옴.