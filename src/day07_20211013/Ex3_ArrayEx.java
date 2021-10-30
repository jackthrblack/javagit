package day07_20211013;

import java.util.Scanner;

public class Ex3_ArrayEx {

	public static void main(String[] args) {
		// 크기가 3인 정수형 배열을 선언하고 스캐너를 이용해 배열에 데이터를 저장하고
		//저장된 값의 총합, 평균을 계산하세요.
		
		Scanner scan = new Scanner(System.in);


		
		int[] num2 = new int[3];
		int sum=0;
		
		
		for(int i = 0; i<num2.length; i++) {
			int num =scan.nextInt();
			num2[i]=num;
			sum+=num2[i];
		}System.out.println(sum);
		System.out.println(sum/num2.length);
	}

}

// 헤맨 이유
//1. 인덱스에 값을 어떻게 집어넣어야하는지 너무 안일하게 생각하다가 복잡합게 생각했다.
// => 안일하게(sum+=num2[num] 이렇게해서 범위 초과 오류가 났음.) 복잡하게(새로운 배열을 선언해서 거기에 num을 담고 하려고했음)
//2. 무작정 해보는것 보다 살짝 침착하게 해보자.
