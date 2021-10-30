package day05_20211008;

public class Ex2_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int i =1;
//		while(run) { 
//			
//			
//			if(i<=6) {
//				System.out.print(i);
//				i++;
//			}else {
//				break;
//			}
//		}
		//System.out.println("\nwhile문 종료");
	
//		while(run) {
//			System.out.println(i);
//			if(i==123456) {
//				run=false;
//			}
//			i++;
//		}
//		System.out.println("\nwhile문 종료"+i);

		while(run) {
			System.out.println(i);
			i++;
			if(i==123456) {
				run=false;
			}
		}
		System.out.println("\nwhile문 종료"+i);
	
	
	}
	

}

//run대신 true로하면 13번줄은 빨간줄(오류)가 뜨는데 while은 조건이 true면 무한히 돌아서 그런다.
//run이면 13번 줄이 잘 있는 이유 : 변수로 선언했기 때문에 while문 안에서 멈출 수 있는 희망이 있어서