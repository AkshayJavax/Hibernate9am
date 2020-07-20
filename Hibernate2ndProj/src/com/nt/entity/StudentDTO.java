package com.nt.entity;

import java.io.Serializable;

public class StudentDTO implements Serializable {
StudentBO bo;
int sno;
String sname;
int m1,m2,m3;
String result=null;
float avg;



public StudentBO getBo() {
	return bo;
}



public int getSno() {
	return sno;
}



public String getSname() {
	return sname;
}



public int getM1() {
	return m1;
}



public int getM2() {
	return m2;
}



public int getM3() {
	return m3;
}



public String getResult() {
	return result;
}



public float getAvg() {
	return avg;
}



public void setBo(StudentBO bo) {
	this.bo = bo;
}



public void setSno(int sno) {
	this.sno = sno;
}



public void setSname(String sname) {
	this.sname = sname;
}



public void setM1(int m1) {
	this.m1 = m1;
}



public void setM2(int m2) {
	this.m2 = m2;
}



public void setM3(int m3) {
	this.m3 = m3;
}



public void setResult(String result) {
	this.result = result;
}



public void setAvg(float avg) {
	this.avg = avg;
}



public String saveData(String name) {
bo=new StudentBO();
avg=(m1+m2+m3)/3;
bo.setAvg(avg);
bo.setSno(getSno());
bo.setSname(getSname());

if(m1<35||m2<35||m3<35) {
	System.out.println("sorry mr."+name+" unfortunately you are fail");
	result="fail";
}
else {
	System.out.println("congratulations mr."+name+" you are pass");
	result="pass";
}
//return result;
bo.setResult(result);
return result;
}

}
