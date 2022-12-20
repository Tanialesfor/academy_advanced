package by.htp.ex.service.impl;

import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.dao.DaoException;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public boolean logination(String login, String password) throws ServiceException {
		// 1. validation - login password
		
		try {
			// 2.  dao - check
			throw new DaoException();
		}catch(DaoException e) {
			throw new ServiceException(e);
		}
		
		
		//return true;
	}

	@Override
	public boolean registration(NewUserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

}
