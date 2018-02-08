package pers.michael.JavaDataStructure.basic.Test;


import java.util.Scanner;

public class Test{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str;
		str = scan.next();
		int length = str.length();
		int i,j;
		
		for(i = 0; i < str.length(); i++) {
			for( j = 1 ; j < str.length()-i; j++) {
				if(str.charAt(i+j) != str.charAt(i)) {
					break;
				}

			    
			}
		    if(j >= 2) {
		    	String substr = str.substring(i, i+j);
		    	System.out.println(str.substring(i, i+j));
		    	i = i + j -1;
		    }
			
		  }
		
	    }
		
	 }


//









	
