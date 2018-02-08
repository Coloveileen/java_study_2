package pers.michael.JavaDataStructure.basic.Test;

import java.util.Scanner;

public class Test1 {
	
	public static int fact(int num) {
		if(num <= 1) return 1;
		else return num*fact(num-1);
	}
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		
		System.out.println("the result is: " + fact(num));
     		
	}
}
	

//µİ¹é½×³Ë



