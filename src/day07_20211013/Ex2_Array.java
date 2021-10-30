package day07_20211013;

public class Ex2_Array {

	public static void main(String[] args) {
		
		// 정수 타입의 number 배열 객체 선언(값, 크기 결정되지 않은 상태)
		
		int[] number;
		//System.out.println(number[0]); // 값이 없어서 오류가 뜬다.
		int number1[];
		int [] number2 = null; //null => 선언 후 값이 없다는 뜻.
		String [] strVar = null;
		
		// 배열 선언하면서 초기값 지정
		int [] number3 = {1,3,12,100,123};
		String [] strVar1= {"가나","가나다라","abcdef","123456!@#$AA"};
		
		// 배열에 저장된 값 출력하기(인덱스 활용)
//		System.out.println(number3[0]); //1
//		System.out.println(number3[1]); //3
//		System.out.println(number3[2]); //12
//		System.out.println(number3[3]); //100
//		System.out.println(number3[4]); //123
//		System.out.println(number3[5]); // out of bounds exeption 발생 => 인덱스 범위를 벗어났다.
		// out of bounds exeption 발생 => 인덱스 범위를 벗어났다.
//		System.out.println(strVar1[0]);
//		System.out.println(strVar1[1]);
//		System.out.println(strVar1[2]);
//		System.out.println(strVar1[3]);
//		System.out.println(strVar1[4]);
		
		// 배열 데이터 바꾸기
		//numbe3 배열의 2번 인덱스에 99 저장
		System.out.println(number3[2]);
		number3[2]=99;
		System.out.println(number3[2]);
		
		// 배열 크기(데이터 개수) 확인
		System.out.println(number3.length);
		int number3Size=number3.length;
		System.out.println(number3Size);
		
		//number3 배열의 크기 : 5
		//number3 배열의 인덱스 : 0~4
		
		//타입: 정수형 , 이름: number4 , 크기: 3
		//인덱스: 0~2
		int[] number4 = new int[3];
		System.out.println(number4[0]); // 0
		
		double[] number5 = new double[2];
		System.out.println(number5[0]); // 0.0
		
		String[] strVar2= new String[3];
		System.out.println(strVar2[0]); // null
		// 타입의 기본 값만 세팅이 되어있어 인덱스 0~2의 값은 다 0이다.
		
		
		//34,555,7898,1111 이 들어있는 정수형 배열 num을 선언
		// 이 배열에 들어있는 값을 for문을 통해 출력해보시오.
		
		int[] num= {34,55,7898,1111};
		
		for(int i =0; i<num.length; i++) { // =이 안나오는 이유는 우리는 0~3까지의 값이 필요한데 4가오면 에러가 나온다.
			System.out.println(num[i]);
		}
		
		//num 배열에 저장된 데이터의 총합과 평균 계산
		int sum=0;
		
		for(int i =0; i<num.length; i++) {
			sum+=num[i];
		}System.out.println(sum);
			System.out.println(sum/num.length);
		
		
		
	}
	
	
}
