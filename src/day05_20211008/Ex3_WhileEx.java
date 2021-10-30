package day05_20211008;

public class Ex3_WhileEx {

	public static void main(String[] args) {
		// 1~10까지 합계 출력
		// 1+~~~+10=55 출력
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			System.out.print(num);
			sum += num;
			num++;
			if (num<11) {
				System.out.print("+");
			} else{
				System.out.print("=");
			}
			// num++;
		}System.out.println(sum);

	}// 내가 헤맨 이유: 
	//1. for문에서 연습했던 것처럼 1,2,3을 출력하는 법에서 헤맸고 if의 조건식에서 num<=9, else if는 10<=라고했다.
	//  => 8+9=1055 이렇게 나왔는데 num=9 일 때, if(10<=9)이므로 false else if로 넘어가고 else if(10<=10)이ㅏㄹ "="은 출력됐다.
	//  => 이제 10이였던게 11로되고 if else if 두 조건에 모두 만족하지 못해 8+9=1055 이렇게 나왔다.
	//2. if의 조건을 num<10으로 했을때 8+9=10=55이렇게 나왔다. 
	//  =>num이 9일때 num++로 인해서 if(10<10)이 되어서 =이 나왔다.

}
