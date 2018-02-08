package pers.michael.JavaDataStructure.basic.Test;

public class MyThirdProgram {
	
	public static void main(String[] args){ 
		
		int array[] = {1,3,2,5,9,12,11,15,10}; //method 1 Êý×é¸³Öµ
			
		for(int i = 0; i < array.length; i++) {
			for( int j = i+1 ; j < array.length; j++) {
				if(array[i] < array[j]) {
					int temp;
					temp = array[i];
					array[i] = array [j];
					array[j] = temp;
					
					
				}
							
			}
		
		}
		int i = 0;
		while (true) {
			System.out.println(array[i]);
			i++;
			if(i > array.length - 1) break;
		}
		
  
	}

}
//Ã°ÅÝÅÅÐò
