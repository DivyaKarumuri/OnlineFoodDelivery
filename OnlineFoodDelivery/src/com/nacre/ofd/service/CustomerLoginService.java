package com.nacre.ofd.service;

import com.nacre.ofd.bo.CustomerLoginBO;
import com.nacre.ofd.dao.CustomerLoginDAO;
import com.nacre.ofd.dto.CustomerLoginDTO;
import com.nacre.ofd.serviceI.serviceCusLogin;

public class CustomerLoginService implements serviceCusLogin {
	String pswd,uname;
	long mobno;
	@Override
	public boolean registeration(CustomerLoginDTO customerLoginDTO) {
		
		CustomerLoginBO customerLoginBO = null;
		CustomerLoginDAO customerLoginDAO = null;
		int flag = 0;
		//Business logic & storing the variable values from adminRegDTO object.
		
		pswd = customerLoginDTO.getPswd();
		mobno = customerLoginDTO.getMobno();
		uname = customerLoginDTO.getUname();		
		
		//creating an object
		customerLoginBO = new CustomerLoginBO();
		customerLoginBO.setUname(uname);
		customerLoginBO.setPswd(pswd);
		customerLoginBO.setMobno(mobno);
		//creating an object for the RegistrationDao
		customerLoginDAO = new CustomerLoginDAO();
		flag = customerLoginDAO.insertData(customerLoginBO);
		if(flag == 0)
			return false;
		else
			return true;
	}
}
