package main;

import java.util.Scanner;

public class Why {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] num2 = new int[num];
		
		int max=-1000000;
		int min=1000000;
		
		for(int i =0; i<num2.length; i++) {
			num2[i] = scan.nextInt();
			
			if(num2[i]>max) {
				max=num2[i];
			}else if(num2[i]<min) {
				min=num2[i];
			}
		}
		System.out.println(min+" "+max);		


	}

}
