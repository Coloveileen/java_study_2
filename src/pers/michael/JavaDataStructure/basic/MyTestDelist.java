 package pers.michael.JavaDataStructure.basic;

import java.util.Scanner;

import pers.michael.JavaDataStructure.basic.MyDelistClass.MyDelist;

public class MyTestDelist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MyDelistClass lists = new MyDelistClass();
		
		while(true) {
			System.out.println("input choice(Q:quit/C:create/D:delete/V:view:/R:replace");
			String choice = scan.next();
			
			switch (choice) {
			case "Q":
				System.exit(0);
			case "C":	
				MyNode node = new MyNode();
				System.out.print("please input value: ");	
				node.setValue(scan.nextInt());
				lists.insert(lists.getSize(), node);
				break;
			case "D":
				System.out.print("please input index for delete: ");	
				int index = scan.nextInt();
				lists.remove(index);
				break;
			case "V":
				lists.view();
				break;
			case "R":
				System.out.print("please input index for replace: ");
				int index1 = scan.nextInt();
			    System.out.print("please enter value: ");
                MyNode node1 = new MyNode();
				node1.setValue(scan.nextInt());
				lists.replace(index1, node1);
				break;

         }
    }			
  }
}
