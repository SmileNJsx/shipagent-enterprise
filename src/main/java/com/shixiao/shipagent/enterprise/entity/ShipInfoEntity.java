package com.shixiao.shipagent.enterprise.entity;

import java.io.Serializable;

public class ShipInfoEntity implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String EnglisnName;
	
	private String ChineseName;
	
	private String OwnerEnglishName;
	
	private String OwnerChineseName;
	
	private String OperatorName;
	
	private String Add_user;
	
	private String Modify_user;

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public String getEnglisnName()
	{
		return EnglisnName;
	}

	public String getChineseName()
	{
		return ChineseName;
	}

	public String getOwnerEnglishName()
	{
		return OwnerEnglishName;
	}

	public String getOwnerChineseName()
	{
		return OwnerChineseName;
	}

	public String getOperatorName()
	{
		return OperatorName;
	}

	public String getAdd_user()
	{
		return Add_user;
	}

	public String getModify_user()
	{
		return Modify_user;
	}

	public void setEnglisnName(String englisnName)
	{
		EnglisnName = englisnName;
	}

	public void setChineseName(String chineseName)
	{
		ChineseName = chineseName;
	}

	public void setOwnerEnglishName(String ownerEnglishName)
	{
		OwnerEnglishName = ownerEnglishName;
	}

	public void setOwnerChineseName(String ownerChineseName)
	{
		OwnerChineseName = ownerChineseName;
	}

	public void setOperatorName(String operatorName)
	{
		OperatorName = operatorName;
	}

	public void setAdd_user(String add_user)
	{
		Add_user = add_user;
	}

	public void setModify_user(String modify_user)
	{
		Modify_user = modify_user;
	}
	
}
