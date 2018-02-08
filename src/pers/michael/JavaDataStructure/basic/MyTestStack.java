package pers.michael.JavaDataStructure.basic;

import java.util.Scanner;

import pers.michael.JavaDataStructure.basic.MyArrayClass.MyNode;
import pers.michael.JavaDataStructure.basic.MyStackClass.*;

public class MyTestStack {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			MyStackClass lists = new MyStackClass();
			
			
			while(true) {
				System.out.println("input choice(q:quit/i:push/o:pop/v:view");
				String choice = scan.next();
				
				switch (choice) {
				case "q":
					System.exit(0);
				case "i":	
					MyNode node = new MyNode();
					System.out.print("please input value: ");	
					node.setValue(scan.nextInt());
					lists.push(node);
					break;
				case "o":
					MyNode node1 = lists.pop();
					System.out.println(node1.getValue());
					break;
				case "v":
					lists.view();
					break;

             }
	    }			
    }
}
