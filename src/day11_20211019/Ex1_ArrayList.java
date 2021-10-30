package day11_20211019;

import java.util.ArrayList; // Array 클래스
import java.util.List; 		// List 인터페이스

public class Ex1_ArrayList {//배열의 크기가 유기적이다.. 배열 안에 있는 값을 수정하기 수월하다.

	public static void main(String[] args) {
		
		//ArrayList 선언
		//List 객체 이름 : list1
		//List에 담을 수 있는 데이터 타입: String
		//<>안에는 클래스 이름만 올 수 있다. 
		List<String> list1 = new ArrayList<String>();
		
		//ArrayList에 데이터 저장
		list1.add("첫번째 데이터"); //-> 0번 인덱스에 저장
		list1.add("두번째 데이터"); //-> 1번 인덱스에 저장
		list1.add(1,"어디에 들어갈까요"); //-> 1은 몇 번 인덱스에 저장할 것인가를 지정해주는 것. / 기존 1번 인덱스에 있던 값은 2번 인덱스로 밀려난다.
		list1.add(1,"이건 어디에?"); //-> 이 값이 1번으로 들어가고 나머지다는 하나씩 밀려난다.
		
		//ArrayList에 담긴 데이터 출력
		//get()메서드: 리턴있음.매개변수 있음.(int) => ArrayList를 선언했을때 지정한 타입으로 리턴해줌.
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2)); //->데이터가 들어있지 않아서 오류.
		System.out.println(list1.get(3)); 
		
		//ArrayList 크기 확인
		//ArrayList 클래스가 가지고 있는 size() 메서드 호출
		//size():리턴있음. 매개변수 없음.
		System.out.println(list1.size());
		
		//ArrayList 데이터 삭제
		System.out.println("삭제전: " + list1.get(1));
		list1.remove(1);
		System.out.println("삭제후: "+list1.get(1));
		System.out.println("삭제후 size: "+list1.size());
		
		// for문을 이용하여 list1에 담긴 모든 데이터 출력
		
			for(int i = 0; i<list1.size(); i++) {
				System.out.println(list1.get(i));
			}
		
		
		/*s
		 *List 객체 이름 : list2
		 *List에 담을 수 있는 데이터 타입: 정수데이터 
		 *int(Integer), long(Long), double(Double), boolean(Boolean)
		 *=> Wrapper 클래스
		 */
		//List<int> list2 = new ArrayList<int>();
		List<Integer> list2 = new ArrayList<Integer>();
		
	}

}
