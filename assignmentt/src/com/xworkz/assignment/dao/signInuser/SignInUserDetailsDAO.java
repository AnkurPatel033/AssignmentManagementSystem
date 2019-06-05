package com.xworkz.assignment.dao.signInuser;

import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;

public interface SignInUserDetailsDAO  {

	
	public SignUpEntity signInUserDetailsCheck(String email,String pass) throws DAOException;
	
}
