package day13_20211021;

import java.util.*;

public class TraineeService {

	/*
	 * 메서드 이름 : listView
	 * 리턴없음
	 * 매개벼누: traineeList
	 */
	
		void listView(List<TraineeDTO> traineeList) {
			System.out.println("listView 호출됨");
			for(int i =0; i<traineeList.size(); i++) {
				System.out.println(traineeList.get(i));
			}
			System.out.println("listView 호출끝");
		}
		
		/*
		 * 훈련생을 추가하는 메서드(addTrainee)
		 * 리스트에 훈련생을 추가하는 기능을 수행함.
		 * Main으로 부터 리스트를 넘겨 받아 훈련생을 추가하고
		 * 다시 Main으로 넘겨주는 코드가 작성되어야 함.
		 */
		
		
		 
//		void addTrainee(List<TraineeDTO> traineeList, TraineeDTO t) {
//		t.setName("김백준");
//			 traineeList.add(t);	
//		
//	}
		/*
		 * 매개변수: traineeList
		 * 리턴타입: List<TraineeDTO>(TraineeDTO 객체를 담는 List)
		 */
		List<TraineeDTO> addTrainee(List<TraineeDTO> traineeList){
			System.out.println("add 호출");
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름:");
			String name = scan.next();
			System.out.print("번호:");
			String phNum = scan.next();
			System.out.print("전공:");
			boolean major = scan.nextBoolean();
			System.out.print("나이:");
			int age = scan.nextInt(); 
			
			TraineeDTO t = new TraineeDTO(name, age, phNum, major);
			traineeList.add(t);
			return traineeList;
		}
		
}
