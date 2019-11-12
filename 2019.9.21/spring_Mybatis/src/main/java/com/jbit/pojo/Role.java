package com.jbit.pojo;

import java.util.Date;

public class Role {
private Integer id;
private String roleCode;
private String roleName;
private Integer createBy;
private Date creationDate;
private Date modifyDate;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRoleCode() {
	return roleCode;
}
public void setRoleCode(String roleCode) {
	this.roleCode = roleCode;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
public Integer getCreateBy() {
	return createBy;
}
public void setCreateBy(Integer createBy) {
	this.createBy = createBy;
}
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
public Date getModifyDate() {
	return modifyDate;
}
public void setModifyDate(Date modifyDate) {
	this.modifyDate = modifyDate;
}
@Override
public String toString() {
	return "Role [id=" + id + ", roleCode=" + roleCode + ", roleName=" + roleName + ", createBy=" + createBy
			+ ", creationDate=" + creationDate + ", modifyDate=" + modifyDate + "]";
}

}
