package day03_20211006;

import java.util.Scanner;

public class Ex6_SwitchExample {

	public static void main(String[] args) {
		/*
		 * 간단한 사전
		 * 사전에는 4개의 단어만 들어 있음.
		 * desk, chair, monitor, mouse
		 * 
		 * 프로그램 실행하면 영어 단어를 입력받고 위의 네 단어중 하나를 입력했을 때 해당 의미를 출력.
		 * 사전에 없는 단어를 입력하면 사전에 없는 단어 입니다. 라고 출력
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("입력단어: ");
		String voca = "";
		
		voca = scan.nextLine();
		
		switch(voca) {
		case "desk":
			System.out.println("책상");
			break;
		case "chair":
			System.out.println("의자");
			break;
		case "mointor":
			System.out.println("모니터");
			break;
		case "mouse":
			System.out.println("마우스");
			break;
		default:
			System.out.println("사전에 없는 단어 입니다.");
		}
	}

}
