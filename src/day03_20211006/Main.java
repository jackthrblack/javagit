package day03_20211006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int H, M;
		
		H = scan.nextInt();
		M = scan.nextInt();
		
		if(M>=0 && M<=59) {
			if(M<45) {
				H--;
				M=60-(45-M);
				System.out.println(H+"시"+" "+M+"분");
			}else if(M>=45) {
				M=M-45;
				System.out.println(H+"시"+" "+M+"분");
			}
		}
		
		
		
	}
}

//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.