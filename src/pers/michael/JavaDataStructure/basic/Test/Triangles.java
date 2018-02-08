package pers.michael.JavaDataStructure.basic.Test;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int size;
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		for( i = 1; i <= size; i++) {
			for( j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		

	}

}

