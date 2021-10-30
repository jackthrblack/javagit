package day08_20211014;

public class Ex1_ArraySort {

	public static void main(String[] args) {
		// 정렬 알고리즘

		int[] num = { 3, 2, 1, 5, 4 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int a = num[i]; // swap을 위한 변수
					num[i] = num[j];
					num[j] = a;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}

//내가 헤맨 이유
//1. 오름차순 내림차순을 어떻게해야할지 몰랐다.
// => 그래서 찾아봤다.
//2. 찾아보고도 헤맨 이유는 num[i]의 배열 {3,2,1,5,4} 하나 
//  => num[j]의 배열 {3,2,1,5,4}하나 이렇게 따로따로 있는 줄 알았다.