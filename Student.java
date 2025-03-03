package Abstraction;

public class Student extends Teacher {
	@Override
	void start() {
		System.out.println("school is started 8 am ");
	}

	@Override
	void close() {
		System.out.println("school is started 2 pm ");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.schooolStatus();
		s.start();
		s.close();
	}
}
