package org.cts;

public class Company {

	public static void main(String[] args) {
		Employee e = Employee.getObject();
		System.out.println(System.identityHashCode(e));

		Employee e1 = Employee.getObject();
		System.out.println(System.identityHashCode(e1));
	}

}
