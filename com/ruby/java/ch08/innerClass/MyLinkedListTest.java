package com.ruby.java.ch08.innerClass;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList myList = new MyLinkedList();
		myList.print();

		myList.add("JAVA");
		myList.add("JSP");
		myList.add("Servlet");
		myList.print();
		
		myList.remove("JSP");
		myList.print();

	}

}
