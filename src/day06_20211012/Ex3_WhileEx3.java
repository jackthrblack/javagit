package day06_20211012;

public class Ex3_WhileEx3 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+7~~~~~
		// 합계가 100을 넘었을 때의 숫자는?

		int sum = 0; 
		int num=0; // 1 -2 3 -4 5 -6~~~
		int count = 1; // 1 2 3 4 5 6 
		int s =1; // 부호용 변수
		boolean run = true;
		
		while (run) {
			sum+=num;
			if(sum >=100) {
				run=false;
			}else {
				num= s * count;
				s = -s;
				count++;
			}
		}
		System.out.println(num);
		System.out.println(sum);
	}
}


//내가 헤멘 이유
//1. 홀수 짝수로 접근을해서 for문을 사용하려고 했는데 while과 for를 같이 쓰기에는 힘들다.
//2. 홀수합-짝수합=합 이렇게 하려고 하니깐 식이 안만들어짐.