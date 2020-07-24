package com.nt.filter;

import com.nt.component.AddEmployee;
import com.nt.component.AddEmployeeimpl;
import com.nt.proxy.AddEmployeeProxyimpl;

public class AddEmployeeFactory {

public static AddEmployee getInstance(String corona) {
	AddEmployee empl=null;
	if(corona.equalsIgnoreCase("") || corona.trim().length()==0) {
		return new AddEmployeeimpl();
	}
	else if(corona.equalsIgnoreCase("there")) {
		return new AddEmployeeProxyimpl(30);
	}
	else {
		return empl;
	}
}
}
