package java_collection;

import java.util.LinkedList;

public class DoublyLinkedList {

	public static void main(String[] args) {
		// create linkedlist
		LinkedList<String> list = new LinkedList<>();

		// Add elements to LinkedList
		list.add("B");
		list.addFirst("A");
		list.addLast("C");
		list.add("D");
		list.add("E");
		list.add(0, "Java");
		System.out.println("LinkedList: " + list);

		// Get the element from the linked list
		System.out.println("Get element at index: " + list.get(1));
		System.out.println("Get first element: " + list.getFirst());
		System.out.println("Get last element: " + list.getLast());

		// Change elements at index
		list.set(1, "Python");
		System.out.println("Updated LinkedList: " + list);

		// Remove elements from index 1
		System.out.println("Removed Element: " + list.remove(list.indexOf("E")));
		list.removeFirst();
		list.removeLast();
		list.removeIf(item -> (item.equals("K")));
		System.out.println("LinkedList: " + list);

		// peek prints 1st element
		System.out.println("Head of the list : " + list.peek());

		// PeekLast prints last element
		System.out.println("Last element of the list is : " + list.peekLast());

		// Adding object
		LinkedList<Student> s = new LinkedList<>();
		Student s1 = new Student("Sakib", 1718, "CSE");
		Student s2 = new Student("Raju", 2312, "EEE");
		Student s3 = new Student("Rahim", 1289, "BBA");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		s.get(1).show();
		
	}

}

class Student {

	String name;
	long id;
	String dept;

	Student(String name, long id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	public void show() {
		System.out.println("Student Name: " + name);
		System.out.println("Student ID: " + id);
		System.out.println("Student Dept: " + dept);
	}

}
