package org.cts;

public class Employee {

	static Employee e;

	// to restrict object creation in outside class
	private Employee() {

	}

	public static Employee getObject() {
		System.out.println(System.identityHashCode(e));
		if (e == null) {
			e = new Employee();
		}
		return e;

	}

	public static void main(String[] args) {
		Employee e = getObject();
		System.out.println(System.identityHashCode(e));

		Employee e1 = getObject();
		System.out.println(System.identityHashCode(e1));

	}

}
