package com.jbit.pojo;

public class Address {
private Integer id;
private String contact;
private String addressDesc;
private String postCode;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddressDesc() {
	return addressDesc;
}
public void setAddressDesc(String addressDesc) {
	this.addressDesc = addressDesc;
}
public String getPostCode() {
	return postCode;
}
public void setPostCode(String postCode) {
	this.postCode = postCode;
}
@Override
public String toString() {
	return "Address [id=" + id + ", contact=" + contact + ", addressDesc=" + addressDesc + ", postCode=" + postCode
			+ "]";
}

}
