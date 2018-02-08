package pers.michael.JavaDataStructure.basic;

import pers.michael.JavaDataStructure.basic.MyArrayClass.*;

public class MyQueueClass extends MyArray {
	
	public MyNode out() {
		if(getSize() <= 0) return null;
		MyNode node = get(1);
		remove(1);
		return node;
	}
	
	public int in(MyNode node) {  //end_in
		insert(getSize(),node);
		return getSize();
	}

}
