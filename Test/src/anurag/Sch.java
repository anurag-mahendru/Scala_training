package anurag;

class School {
	
	public String name = "sasas";

}

class Student extends School {
	private int marks;

	public void setmarks(int x) {
		marks = x;
	}

	public void getmarks() {
		System.out.println(marks);
	}

}

public class Sch {

	public static void main(String s[]) {
		
		Student anurag = new Student();
		System.out.println("School name is " + anurag.name);
		anurag.setmarks(89);
		anurag.getmarks();

	}
}
