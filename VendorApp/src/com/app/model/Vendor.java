package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventab")
public class Vendor {
	public String getVenMobile() {
		return venMobile;
	}
	public void setVenMobile(String venMobile) {
		this.venMobile = venMobile;
	}
	@Id
	@Column(name="venid")
	private int venId;
	@Column(name="vencode")
	private String venCode;
	@Column(name="venname")
	private String venName;
	@Column(name="ventype")
	private String venType;
	public String getVenType() {
		return venType;
	}
	public void setVenType(String venType) {
		this.venType = venType;
	}
	@Column(name="venemail")
	private String venEmail;
	@Column(name="venaddr")
	private String venAddr;
	@Column(name="venmobile")
	private String venMobile;
	public Vendor(int venId) {
		super();
		this.venId = venId;
	}
	public Vendor() {
		super();
	}
	public int getVenId() {
		return venId;
	}
	public void setVenId(int venId) {
		this.venId = venId;
	}
	public String getVenCode() {
		return venCode;
	}
	public void setVenCode(String venCode) {
		this.venCode = venCode;
	}
	public String getVenName() {
		return venName;
	}
	public void setVenName(String venName) {
		this.venName = venName;
	}
	public String getVenEmail() {
		return venEmail;
	}
	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}
	public String getVenAddr() {
		return venAddr;
	}
	public void setVenAddr(String venAddr) {
		this.venAddr = venAddr;
	}
	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venCode=" + venCode + ", venName="
				+ venName + ", venEmail=" + venEmail + ", venAddr=" + venAddr
				+ "]";
	}

}
