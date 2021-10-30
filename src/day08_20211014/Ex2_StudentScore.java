package day08_20211014;

import java.util.Scanner;

public class Ex2_StudentScore {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int student = 0;
		int max = 0;
		int sum=0;
		boolean run = true;
		int[] arr = null;
		do {

			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.print("선택> ");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.print("학생수> ");
				student = scan.nextInt();
				arr = new int[student];
			} else if (menu == 2) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print((i + 1) + "번 학생 점수입력> ");
					int score = scan.nextInt();
					arr[i]=score;
					}
			} else if (menu == 3) {
				for(int i = 0; i<arr.length; i++) {
				System.out.println((i+1) + "번 학생 점수 : " + arr[i]);
				}
			}else if (menu == 4) {
				for(int i = 0; i<arr.length; i++) {
					sum+=arr[i];
					if(arr[i]>max) {
						max=arr[i];
					}
				}
				System.out.println("최고점수 : " + max);
				
				double average = sum / student;
				System.out.println("평균점수 : " + average);
				
				for(int i = 0; i<arr.length; i++) {
					for(int j =0; j<arr.length; j++) {
						if(arr[i]<arr[j]) {
							int a = arr[i];
							arr[i]=arr[j];
							arr[j]=a;
						}
					}
				}
				for(int i = 0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}
			}else {
				run=false;
			}
		} while (run);
	}
}
