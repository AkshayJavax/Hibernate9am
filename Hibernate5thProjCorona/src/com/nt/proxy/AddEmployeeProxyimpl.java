package com.nt.proxy;

import com.nt.component.AddEmployee;
import com.nt.component.AddEmployeeimpl;

public class AddEmployeeProxyimpl implements AddEmployee {
public AddEmployee empl;
int reduce;
public  AddEmployeeProxyimpl(int reduce) {
	this.reduce=reduce;
	empl=new AddEmployeeimpl();
		
}
	@Override
	public String employee(int emp) {
		double finaltouch=0;
		finaltouch=emp-emp*reduce/100;
		
		return finaltouch+"only this much employee should work";
	}

}
