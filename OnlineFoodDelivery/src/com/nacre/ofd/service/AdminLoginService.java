package com.nacre.ofd.service;

import com.nacre.ofd.bo.AdminLoginBO;
import com.nacre.ofd.dao.AdminLoginDAO;
import com.nacre.ofd.dto.AdminLoginDTO;
import com.nacre.ofd.serviceI.serviceLogin;

public class AdminLoginService implements serviceLogin {
	String pswd,uname;
	long mobno;
	@Override
	public boolean registeration(AdminLoginDTO adminLoginDTO) {
		
		AdminLoginBO adminLoginBO = null;
		AdminLoginDAO adminLoginDAO = null;
		int flag = 0;
		//Business logic & storing the variable values from adminRegDTO object.
		
		pswd = adminLoginDTO.getPswd();
		mobno = adminLoginDTO.getMobno();
		uname = adminLoginDTO.getUname();		
		
		//creating an object
		adminLoginBO = new AdminLoginBO();
		adminLoginBO.setUname(uname);
		adminLoginBO.setPswd(pswd);
		adminLoginBO.setMobno(mobno);
		//creating an object for the RegistrationDao
		adminLoginDAO = new AdminLoginDAO();
		flag = adminLoginDAO.insertData(adminLoginBO);
		if(flag == 0)
			return false;
		else
			return true;
	}
}
