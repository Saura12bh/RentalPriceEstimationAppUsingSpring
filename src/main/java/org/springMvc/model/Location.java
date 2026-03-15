package org.springMvc.model;

public class Location {
private int locationcode;
public int getLocationcode() {
	return locationcode;
}
public void setLocationcode(int locationcode) {
	this.locationcode = locationcode;
}
public String getLocationname() {
	return locationname;
}
public void setLocationname(String locationname) {
	this.locationname = locationname;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
private String locationname;
private int cid;
}