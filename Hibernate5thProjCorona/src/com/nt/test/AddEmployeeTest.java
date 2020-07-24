package com.nt.test;

import com.nt.component.AddEmployee;
import com.nt.filter.AddEmployeeFactory;

public class AddEmployeeTest {

	public static void main(String[] args) {
		AddEmployeeFactory factory=null;
		AddEmployee empl=null;
		empl=factory.getInstance("there");
		System.out.println(empl.getClass());
        System.out.println(empl.employee(1000));
	}

}
