package day05_20211008;

public class Ex4_Random {

	public static void main(String[] args) {
		// Random 메서드
		// 특정 범위를 지정하면 해당 범위 내에서 숫자를 무작위 발생시킴.
		// 1~10 사이의 정수 하나를 발생
		// (int)(Math.random()*10)+1
		// 1은 시작값 10은 끝 값
		// random() => 0보다 크고 1보다 작은 실수
		
		System.out.println((int)(Math.random()*10)+1);
		
		System.out.println(Math.random()*10); //정수를 쓰기위해 10곱함
		System.out.println((int)Math.random()*10); // =>0 (int)Math.random() 먼저 실행해서 0 *10 => 0
		System.out.println((int)(Math.random()*10)); // 0보다 크거나 같고 10보다 작은 값을 출력 0~9
		System.out.println((int)(Math.random()*10)+1); // +1을 해줘야한다. 1~10;
		
		// Math class의 random() 메서드 호출
		// public static double(리턴해주는것 ) random()(메서드 이름){}
		System.out.println(Math.random());
		
		//우리는 정수가 필요하기 때문에 실수를 정수로 바꾸는 과정.
		//실수 -> 정수 => 강제 형변환(type) Casting =>데이터 손실이 일어남.
		
		int intVar=10;
		double doubleVar=1.234;
		
		//정수 => 실수
		doubleVar = intVar;
		System.out.println(doubleVar);
		
		doubleVar=12.1235489;
		intVar = (int)doubleVar; //실수->정수 / 더 큰 데이터를 작은 데이터에 담을 수 없다.
		System.out.println(intVar);
	}

}
