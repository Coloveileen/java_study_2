package pers.michael.JavaDataStructure.basic;

import pers.michael.JavaDataStructure.basic.MyListClass.*;

public class MyDequeueClass extends MyList {
	
	public boolean isEmpty() {
		return (Boolean) null;
	}
	
	public int head_in(MyNode node){
		insert(0,node);
		return getSize();
	}
	
	public int end_in(MyNode node) {
		insert(getSize(),node);
		return getSize();	
	}
	
	public MyNode head_out() {
		MyNode node = get(1);
		remove(1);
		return node;
	}
	
	public MyNode end_out() {
		MyNode node = get(getSize());
		remove(getSize());
		return node;
	}

}
