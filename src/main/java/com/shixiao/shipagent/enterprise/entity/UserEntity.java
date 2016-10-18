package com.shixiao.shipagent.enterprise.entity;

import java.io.Serializable;

public class UserEntity implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long uuid;
	
	private String username;
	
	private String password;

	public long getUuid()
	{
		return uuid;
	}
	
	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}
	
	public void setUuid(long uuid)
	{
		this.uuid = uuid;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	
	
}
