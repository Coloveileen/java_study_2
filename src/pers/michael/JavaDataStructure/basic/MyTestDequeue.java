package pers.michael.JavaDataStructure.basic;

import pers.michael.JavaDataStructure.basic.MyListClass.*;

import pers.michael.JavaDataStructure.basic.MyDequeueClass.*;

import java.util.Scanner;

public class MyTestDequeue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MyDequeueClass adt = new MyDequeueClass();
		
		
		while(true) {
			System.out.println("input choice(q:quit/hi:head_in/ho:head_out/ei:end_in/eo:end_out/v:view:)");
			String choice = scan.next();
			
			switch (choice) {
			case "q":
				System.exit(0);
			case "hi":	
				MyNode node = new MyNode();
				System.out.print("please input value: ");	
				node.setValue(scan.nextInt());
				adt.head_in(node);
				break;
			case "ho":
				MyNode node1 = adt.head_out();
				if(node1!=null) System.out.println(node1.getValue());
				break;
			case"ei":
				MyNode node3 = new MyNode();
				System.out.print("please input value: ");
				node3.setValue(scan.nextInt());
				adt.end_in(node3);
				break;
			case"eo":
				MyNode node2 = adt.end_out();
				if(node2!=null) System.out.println(node2.getValue());
				break;
			case "v":
				adt.view();
				break;

         }
    }			
}

}
