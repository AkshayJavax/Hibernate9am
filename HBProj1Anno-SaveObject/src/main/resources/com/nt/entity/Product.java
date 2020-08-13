package com.nt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity()
public class Product implements Serializable {
private int pid;
private String pname;
private int price;
private Date mfgDate;
private Date expiryDate;
@Id
@Column(name="PID")
public int getPid() {
	return pid;
}
@Column(name="PNAME",nullable=true,unique=true)
public String getPname() {
	return pname;
}
@Column(name="PRICE")
public int getPrice() {
	return price;
}
@Column(name="MFGDATE")
public Date getMfgDate() {
	return mfgDate;
}
@Column(name="EXPIRYDATE")
public Date getExpiryDate() {
	return expiryDate;
}
public void setPid(int pid) {
	this.pid = pid;
}
public void setPname(String pname) {
	this.pname = pname;
}
public void setPrice(int price) {
	this.price = price;
}
public void setMfgDate(Date mfgDate) {
	this.mfgDate = mfgDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", mfgDate=" + mfgDate + ", expiryDate="
			+ expiryDate + "]";
}

}
