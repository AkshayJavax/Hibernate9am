package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.Data;

@Entity
@Table
@Data
public class MobileInfo {
@Id	
private int serNo;
@Column(name="mobNo",length=45)
private long mobNo;
@Column(name="holderName",length=45)
private String holderName;
@Version
private int count;
}
