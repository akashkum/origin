package com.capgemini.uas.service;

import com.capgemini.uas.dto.UsersBean;
import com.capgemini.uas.exception.UniversityException;

public interface IUsersService {

	public String checkUser(UsersBean userBeanMain) throws UniversityException;
}
