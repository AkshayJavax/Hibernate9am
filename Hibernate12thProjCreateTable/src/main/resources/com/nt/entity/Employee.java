package com.nt.entity;

import java.io.Serializable;

public class Employee implements Serializable {
private int eno;
private String ename;
private String eadd;
private String desg;
private int salary;
public int getEno() {
	return eno;
}
public String getEname() {
	return ename;
}
public String getEadd() {
	return eadd;
}
public String getDesg() {
	return desg;
}
public int getSalary() {
	return salary;
}
public void setEno(int eno) {
	this.eno = eno;
}
public void setEname(String ename) {
	this.ename = ename;
}
public void setEadd(String eadd) {
	this.eadd = eadd;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", eadd=" + eadd + ", desg=" + desg + ", salary=" + salary
			+ "]";
}


}
