package linkedlist;

import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		LinkedList<Student> obj = new LinkedList<>();
		Student s1 = new Student("java",20);
		Student s2 = new Student("goa",21);
		obj.add(s1);
		obj.add(s2);
		System.out.println(obj);
		for(Student obj1 : obj)
		{
			System.out.println(obj1.age);
			System.out.println(obj1.name);
		}
	}
}