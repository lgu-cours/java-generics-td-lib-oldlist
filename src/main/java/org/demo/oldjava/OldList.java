package org.demo.oldjava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OldList {

	List list = new LinkedList();
	
	public OldList() {
		super();
	}

	public void addItem(Object item) 
	{
		list.add(item);
	}
	
	public void addItems(List items) 
	{
		Iterator iter = items.iterator() ; 
		while ( iter.hasNext() ) {
			Object o = iter.next();
			if ( o instanceof String ) {
				list.add(o);
			}
		}
	}
	
	public List getItems() 
	{
		return list ;
	}
}
