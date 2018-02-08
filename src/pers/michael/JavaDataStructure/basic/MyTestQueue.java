package pers.michael.JavaDataStructure.basic;

import java.util.Scanner;

import pers.michael.JavaDataStructure.basic.MyArrayClass.MyNode;

import pers.michael.JavaDataStructure.basic.MyQueueClass;

public class MyTestQueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MyQueueClass lists = new MyQueueClass();
		
		
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
				lists.in(node);
				break;
			case "o":
				MyNode node1 = lists.out();
				if(node1!=null) System.out.println(node1.getValue());
				break;
			case "v":
				lists.view();
				break;

            }
        }			
    }
}
