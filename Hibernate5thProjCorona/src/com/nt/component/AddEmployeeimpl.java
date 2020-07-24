package com.nt.component;

public class AddEmployeeimpl implements AddEmployee {

	@Override
	public String employee(int emp) {
		emp=emp+emp*10/100;
		
		return "the additional emp is"+emp;
	}

}
