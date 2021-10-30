package day05_20211008;

public class Ex6_WhileEx {

	public static void main(String[] args) {
		// 2개의 주사위를 던져서 합이 5일때 종료하는 프로그램.
		
		int i =0;
		int j =0;
		while(true) {
			
			i=(int)(Math.random()*6)+1;		
			j=(int)(Math.random()*6)+1;
			//System.out.println("("+i+", "+j+")");	
			if((i+j)==5) {
				break;
			} System.out.println("("+i+", "+j+")");	
		}
		
	}

}
