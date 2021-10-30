package day07_20211013;

import java.util.Scanner;

public class Ex6_ArrayEx {

	public static void main(String[] args) {
		// 아래와 같이 배열이 있을 때
		// 어떤 숫자가 몇번 인덱스에 있는지 출력
		// 예) 8 입력하면 8은 9번 인덱스에 있습니다.
		//		4 입력하면 4는 4번 인덱스에 있습니다.
		
		int num[] = {5,2,1,3,4,7,6,9,10,8};
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("배열 크기: ");
		int num2=in.nextInt();
		for(int i = 0; i<num.length; i++) {
			
			if(num[i]==num2) {
				System.out.println(num2+"는 "+i+"번 인덱스에 있습니다.");
			}
		} 

	}

}

//헤맨 이유
//1. 배열 자체를 출력하려고했다.
//2. num[i]에서 i를 찾고 싶은거지 num[i]자체를 말하는게 아니다.