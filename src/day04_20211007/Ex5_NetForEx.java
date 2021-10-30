package day04_20211007;

public class Ex5_NetForEx {

	public static void main(String[] args) {
		// 중첩 for문을 활용하여 구구단 출력
		
		int var =0;
		
		for(int i = 2; i<10; i++) {
			for(int j = 1; j<10; j++) {
				var = i*j;
				System.out.print(i+"x"+j+"="+var);
				System.out.print("\t");
			}
			System.out.println(); //줄바꿈 ->\n
		} 

	}

}