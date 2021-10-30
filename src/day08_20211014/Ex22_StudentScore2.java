package day08_20211014;

import java.util.Scanner;

public class Ex22_StudentScore2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		int[] scores = null;
		int studentNum=0;
		int selectNo = 0;
		
		while(run) {
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.print("선택> ");
			
			selectNo = scan.nextInt();
			
			switch(selectNo) {
			case 1:
				//학생수 입력받고 학생 수 크기를 갖는 배열로 선언
				System.out.print("학생수> ");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				//배열에 점수 데이터 저장
				for(int i=0; i<scores.length; i++) {
					System.out.println((i+1)+"번 째 학생 점수: ");
					scores[i] = scan.nextInt();
				}
				break;
			case 3:
				// 저장된 데이터 출력
				for(int i=0; i<scores.length; i++) {
					System.out.println((i+1)+"번 째 학생 점수: ");
				}
				break;
			case 4:
				//최댓값, 평균값, 내림차순, 정렬
				int sum=0, max=0;
				double avg = 0.0;
				for(int i = 0; i<scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
						sum+=scores[i];
				}
				avg = sum/scores.length;
				
				//내림차순 정렬
				int temp = 0;
				for(int i = 0; i<scores.length; i++) {
					for(int j = i+1; j<scores.length; j++) {
						if(scores[i]<scores[j]) {
							temp=scores[i];
							scores[i]=scores[j];
							scores[j]=temp;		
						}
					}
				}
				break;
			case 5:
				//종료
				run=false;
				break;
			}
			
		}

	}

}
