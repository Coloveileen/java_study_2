package pers.michael.JavaDataStructure.basic.Test;

import java.util.Scanner;

public class MySecondProgram {
	
	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
	    
		String str;
	    str = scan.next();
	    int length = str.length();
	    for(int i = 0; i < length-1; i++) {
	    	if(str.charAt(i)==str.charAt(i+1)) {
	    		System.out.printf("%c %c\n", str.charAt(i),str.charAt(i+1)); 	
	    	}
	    	
	    }
		  
	   		
	}	

}
