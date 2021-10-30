package day05_20211008;

public class Ex1_While {

	public static void main(String[] args) {
		// while
		// while 이용해 1부터 3까지 출력

		int num = 1;

		while (num <= 3) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("\ndo while 시작"); 
		
		int i=10;
		do {
			System.out.println("do while 내부");
			System.out.println(i);
			i++;
		}while(i<=16);
		System.out.println("while문 종료: "+i);
		
		
		
		System.out.println("\nfor문 시작");
		for (int j = 1; j <= 3; j++) {
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
