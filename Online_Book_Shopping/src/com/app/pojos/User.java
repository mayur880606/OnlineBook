package com.app.pojos;
import javax.persistence.*;
@Entity
@Table(name="user")
public class User{
	
	private Integer userId,customerId;
	private String username,password;
	private String Role;
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Column(name="customer_id")
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	@Column(name="username")
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	
	
}
