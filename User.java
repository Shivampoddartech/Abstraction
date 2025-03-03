package Abstraction;

public class User extends Car {

	void end() {
		System.out.println("Car Stoped");
	}

	void start() {
		System.out.println("Vechicle Started");

	}

	public static void main(String[] args) {
		User u = new User();
		u.start();
		u.end();
		u.shiftGears();
	}

}
