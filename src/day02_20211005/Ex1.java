package day02_20211005;

public class Ex1 {

	public static void main(String[] args) {

		// 논리연산자
		// &&연산
		boolean result1 = true && true;
		System.out.println(result1);

		boolean result2 = true && false;
		System.out.println(result2);

		boolean result3 = false && true;
		System.out.println(result3);

		boolean result4 = false && false;
		System.out.println(result4);

		// ||연산
		boolean result5 = true || true;
		System.out.println(result5);

		boolean result6 = true || false;
		System.out.println(result6);

		boolean result7 = false || true;
		System.out.println(result7);

		boolean result8 = false || false;
		System.out.println(result8);

		// !연산
		boolean result9 = false;
		System.out.println(!result9); // <- 단순 출력을 위해서 하는 것. result9의 변수 값은 바뀌지 않았다.
		result9 = !result9; // <- result9의 변수를 바꾸는 것.
		System.out.println(result9);
		System.out.println(5 > 2); // true
		System.out.println(!(5 > 2)); // false

		// and
		// 영어 수학 점수가 둘다 90점 이상이면 합격(true)
		int engScore = 95, mathScore = 97;
		boolean resutl1 = false;
		resutl1 = engScore >= 90 && mathScore > 90;
		System.out.println(resutl1);

		boolean var1 = engScore >= 90 && mathScore >= 90;
		System.out.println(var1);

		// 회원가입을 할 때 id=myid, password= 1234라고 기입하고
		// 나중에 로그인을 한다고 했을 때 id, pw을 모두 맞게 입력 => true
		// 둘 중 하나라도 틀린 값을 입력하면 실패 => false

		String id = "myid", pw = "1234";
		boolean loginResult = id == "myid" && pw == "1234";
		System.out.println(loginResult);
		id = "ididididid";
		loginResult = id == "myid" && pw == "1234";
		System.out.println(loginResult);

		int num = 4;

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			System.out.println("0보다 큰 수를 입력하세요.");
		}

	}
}