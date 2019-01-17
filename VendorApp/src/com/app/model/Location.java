package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//ctrl+shift+O


@Entity
@Table(name="loc_tab")
public class Location implements Comparable<Location>{
	@Id
	@Column(name="lid")
	private int locId;
	
	@Column(name="lcode")
	private String locCode;
	@Column(name="lname")
	private String locName;
	@Column(name="ltype")
	private String locType;
	
	//alt+shift+S,O (De-Select All->OK)
	public Location() {
		super();
	}
	//alt+shift+S,O (De-Select All
	//-> select locId->OK)
	public Location(int locId) {
		super();
		this.locId = locId;
	}
	
	//alt+shift+S,R(selectAll->OK)
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getLocType() {
		return locType;
	}
	public void setLocType(String locType) {
		this.locType = locType;
	}
	
	//alt+shift+S,S (OK)
	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locCode=" + locCode
				+ ", locName=" + locName + ", locType=" + locType + "]";
	}
	
	//ctrl+space- select compareTo->enter
	@Override
	public int compareTo(Location o) {
		//asc (this-o)
		return this.getLocId()-o.getLocId();
		//desc (o-this)
		//return o.getLocId()-this.getLocId();
	}
}
