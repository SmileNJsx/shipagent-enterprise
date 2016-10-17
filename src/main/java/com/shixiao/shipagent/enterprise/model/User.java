package com.shixiao.shipagent.enterprise.model;

/**
 * @author Smile
 *
 */
public class User {
	private String name;
	private String password;
	private String email;
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setPassWord(String password){
		this.password = password;
	}
	
	public String getPassWord(){
		return password;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
}
