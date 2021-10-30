package day04_20211007;

public class Ex3_ForExample_2 {

	public static void main(String[] args) {
		// 1부터 100까지의 숫자 중에서 3의 배수만 출력하기
		// if문을 사용할 때 실행하고 싶은 문장이 한 줄이면 {}생략 가능
		// {}생략 했을때는 한 줄만 if문 영역으로 인식하고 다음 줄은 for문으로 인식한다.
		
		
		for(int i =1; i<=10; i++) {
			if(i%3==0)   
				System.out.println(i);
				System.out.println("언제나오는지");
			
		}
	}

}
