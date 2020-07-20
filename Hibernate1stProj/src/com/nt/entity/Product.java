package com.nt.entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
private int pid;
private String pname;
private float price,stockqty;
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
public float getStockqty() {
	return stockqty;
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
public void setStockqty(float stockqty) {
	this.stockqty = stockqty;
}
public void setMfgdate(Date mfgdate) {
	this.mfgdate = mfgdate;
}
public void setExpirydate(Date expirydate) {
	this.expirydate = expirydate;
}



}
