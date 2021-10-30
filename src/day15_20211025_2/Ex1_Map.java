package day15_20211025_2;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {

	public static void main(String[] args) {
		// 맵 선언
		//key(구분용 데이터): int , value: String
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		//맵에 데이터 저장
		//키 값은 순차적으로 1,2,3으로 저장되는게 아니라 내가 지정한 키 값대로 저장이 된다.
		//put 메서드 사용, 매개변수 key, value순으로
		map1.put(1, "데이터1");
		map1.put(2, "데이터2");
		map1.put(11, "데이터3"); //key값을 순차적으로 줄 필요는 없다.
		
		// 맵에 담긴 데이터 출력
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(11));
		
		map1.put(11,"데이터3333");
		System.out.println(map1.get(11)); //덮어쓰기.
		
		//반복문에 활용
		for(Integer n: map1.keySet()) { //set =>주머라 표현 키로만 이루어진 set을 만든다.
			String s = map1.get(n);
			System.out.println("키값: "+n);
			//System.out.println(s);
			System.out.println("벨류값: "+s);
			
			//System.out.println(map1.get(n));
		}
		
		Map<String, Integer> map3 = new HashMap<>();
		
		map3. put("키1", 1234);
		map3. put("키2", 12345);
		System.out.println(map3.get("키2"));
		
		for(String v:map3.keySet()) {
			System.out.print("키값: "+v);
			System.out.println("\t 벨류값: "+map3.get(v));
		}
		
		//맵 데이터 삭제
		map3.remove("키1");
		
		
		//TestDTO를 담는 map 선언
		Map<Integer, TestDTO> testMap = new HashMap<>();
		
		//TestDTO 객체 3개 만들기
		TestDTO test1 = new TestDTO(1,"aaa","aaaa");
		TestDTO test2 = new TestDTO(2,"bbb","bbbb");
		TestDTO test3 = new TestDTO(3,"ccc","cccc");
		
		testMap.put(1, test1);
		testMap.put(2, test2);
		testMap.put(3, test3);
		
		//key값이 2인 곳에 저장된 데이터 출력
		System.out.println(testMap.get(2)); //test2 객체
		
		for(Integer i : testMap.keySet()) {
			System.out.println(testMap.get(i));
		}
	
		//맵 크기 확인
		System.out.println(testMap.size());
	
	}

}
