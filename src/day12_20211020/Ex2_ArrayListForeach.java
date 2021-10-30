package day12_20211020;

import java.util.*;

public class Ex2_ArrayListForeach {

	public static void main(String[] args) {
		// foreach(advanced for문)
		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("spring");
		list.add("spring boot");

		//전통적인 for문으로 list  데이터 출력
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//foreach를 사용
		//다량의 데이터를 가지고 있는 객체(ArrayList, 배열 등)에 접근할 때
		//for(반복변수: 반복접근할객체) => 반복변수와 반복접근용객체의 데이터 타입은 동일해야 한다.
		for(String var:list) {
			System.out.println(var);
		}
	}

}
