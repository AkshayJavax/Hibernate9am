package com.nt.entity;

import java.io.Serializable;

public class StudentBO  {
private int sno;
private String sname,result;
private float avg;
public int getSno() {
	return sno;
}
public String getSname() {
	return sname;
}
public String getResult() {
	return result;
}
public float getAvg() {
	return avg;
}
public void setSno(int sno) {
	this.sno = sno;
}
public void setSname(String sname) {
	this.sname = sname;
}
public void setResult(String result) {
	this.result = result;
}
public void setAvg(float avg) {
	this.avg = avg;
}

}
