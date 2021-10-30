package day13_20211021;

import java.util.*;

public class TraineeMain {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<TraineeDTO> traineeList = new ArrayList<>();
		
		TraineeDTO tr1 = new TraineeDTO();
		
		tr1.setName("이름1");
		tr1.setAge(18);
		tr1.setPhoneNumber("555");
		tr1.setMajor(true);
		
		TraineeDTO tr2 = new TraineeDTO("이름2", 17, "666", true);
		
//		TraineeDTO tr3 = new TraineeDTO();
//		
//		String name = scan.next();
//		tr3.setName("이름:" +name);
//		
//		String phNum = scan.next();
//		tr3.setPhoneNumber("번호: " + phNum);
//		boolean major = scan.nextBoolean();
//		tr3.setMajor(major);
//		int age = scan.nextInt(); 
//		tr3.setAge(age);
//		
		traineeList.add(tr1);
		traineeList.add(tr2);
		//traineeList.add(tr3);
		
//		for(int i=0; i<traineeList.size(); i++) {
//			System.out.println("for문: " +traineeList.get(i).toString());
//		}
//		
//		for(TraineeDTO j : traineeList) {
//			System.out.println("foreach문: "+ j.toString());
//		}
		
		//알아둘 것.
		//1. 스캐너가 스트링 인트 스트링 인트 이렇게 할 경우
		//	 인식을 잘 하지 못해 한 가지 먼저 스캐너하고 다음걸 써야한다.
		
		
		//traineeList를 TraineeService 클래스로 넘겨서 출력
		/*
		 * 매개변수로 전달하는 값: traineeList
		 */
		// listView 메서드를 호출하면서 tranieeList를 전달하는 코드 작성
		TraineeService ts = new TraineeService();
		// 객체를 만들어야 해당 클래스가 가지고 있는
		// 자원(필드,메서드 등등)을 활용할 수 있음.
		
		System.out.println("Main에서 listView 호출전");
		ts.listView(traineeList);
		System.out.println("Main에서 listView 호출후");


		
//		TraineeDTO tr4 = new TraineeDTO();
//		
//		ts.addTrainee(traineeList, tr4);
		
		//System.out.println(traineeList.get(2));
		
		//TraineeMain에서 traineeList를 관리
		traineeList = ts.addTrainee(traineeList);
		//System.out.println(traineeList.get(0));
		
		for(int i = 0; i<traineeList.size(); i++) {
			System.out.println(traineeList.get(i));
		}
		
		
	}
}
