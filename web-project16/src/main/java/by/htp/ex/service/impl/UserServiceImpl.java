package by.htp.ex.service.impl;

import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.DaoProvider;
import by.htp.ex.dao.UserDao;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.UserService;
import by.htp.ex.util.validation.UserDataValidation;
import by.htp.ex.util.validation.ValidationProvider;

public class UserServiceImpl implements UserService{

	private final UserDao userDao = DaoProvider.getInstance().getUserDao();
	//private final UserDataValidation userDataValidation = ValidationProvider.getIntsance().getUserDataVelidation();
	
	@Override
	public boolean logination(String login, String password) throws ServiceException {
		
		/*
		 * if(!userDataValidation.checkAUthData(login, password)) { throw new
		 * ServiceException("login ...... "); }
		 */
		
		
		try {
			return userDao.logination(login, password);
		}catch(DaoException e) {
			throw new ServiceException(e);
		}
		
	}

	@Override
	public boolean registration(NewUserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

}
