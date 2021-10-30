package day04_20211007;

public class Ex6_ForEx {

	public static void main(String[] args) {
		// 4x+5y = 60 을 만족하는 x,y 값을 출력.
		// x,y는 1보다 크고 10보다 작은 정수
		
		for(int x = 1; x<=10; x++) {
			for(int y = 1; y<=10; y++) {
				if((4*x)+(5*y)==60){
					System.out.println(+x+","+y);
				}
			}
		}

	}

}

