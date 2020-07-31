package com.nt.entity;

import java.util.Date;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.Proxy;





public final class Product implements IProduct{
private int pid;
private String pname;
private float price;
private Date mfgdate,expirydate;
public int getPid() {
	return pid;
}
public String getPname() {
	return pname;
}
public float getPrice() {
	return price;
}
public Date getMfgdate() {
	return mfgdate;
}
public Date getExpirydate() {
	return expirydate;
}
public void setPid(int pid) {
	this.pid = pid;
}
public void setPname(String pname) {
	this.pname = pname;
}
public void setPrice(float price) {
	this.price = price;
}
public void setMfgdate(Date mfgdate) {
	this.mfgdate = mfgdate;
}
public void setExpirydate(Date expirydate) {
	this.expirydate = expirydate;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", mfgdate=" + mfgdate + ", expirydate="
			+ expirydate + "]";
}



}
