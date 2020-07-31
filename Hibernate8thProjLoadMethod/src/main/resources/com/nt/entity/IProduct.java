package com.nt.entity;

import java.util.Date;

public interface IProduct {
	public int getPid();
	public String getPname() ;
	public float getPrice();
	public Date getMfgdate();
	public Date getExpirydate();
	
	public void setPid(int pid) ;
	
	public void setPname(String pname);
	
	public void setPrice(float price);
	
	public void setMfgdate(Date mfgdate);
	
	public void setExpirydate(Date expirydate);
	
}
