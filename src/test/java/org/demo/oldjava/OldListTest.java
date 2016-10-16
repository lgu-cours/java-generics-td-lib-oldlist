package org.demo.oldjava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

public class OldListTest extends TestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	private void print(List items ) {
		System.out.println("Items :");
		Iterator iter = items.iterator() ; 
		while ( iter.hasNext() ) {
			Object o = iter.next();
			System.out.println(" . " + o );
		}
	}

	public void test() {
		OldList list = new OldList();
		list.addItem("A");
		list.addItem("B");
		list.addItem("C");
		
		print ( list.getItems() ) ;
		
		LinkedList list2 = new LinkedList();
		list2.add("X");
		list2.add("Y");
		list2.add("Z");
		
		list.addItems(list2);
		print ( list.getItems() ) ;
	}

}
