package com.niit.musichub.dao;

public class UserDAO {
public boolean isValid(String userID, String password)
{
if(userID.equals("rishab") && password.equals("rishab"))
	return true;
else
	return false;
}
}
