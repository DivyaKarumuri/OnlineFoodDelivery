package com.nacre.ofd.service;

import com.nacre.ofd.bo.AdminRegBO;
import com.nacre.ofd.dao.AdminRegDAO;
import com.nacre.ofd.dto.AdminRegDTO;
import com.nacre.ofd.serviceI.serviceReg;

public class AdminRegService implements serviceReg {
	String fname,lname,email,pass,confirmpass,uname,gen;
	long mobno;
	@Override
	public boolean registeration(AdminRegDTO adminRegDTO) {
		
		AdminRegBO adminRegBO = null;
		AdminRegDAO adminRegDAO = null;
		int flag = 0;
		//Business logic
		if(adminRegDTO.getPass().equals(adminRegDTO.getConfirmpass())) {
			
			int length = adminRegDTO.getPass().length();
			if(length >= 8) {
			
				//storing the variable values from adminRegDTO object.
				fname = adminRegDTO.getFname();
				lname = adminRegDTO.getLname();
				email = adminRegDTO.getEmail();
				pass = adminRegDTO.getPass();
				confirmpass = adminRegDTO.getConfirmpass();
				mobno = adminRegDTO.getMobno();
				uname = adminRegDTO.getUname();
				gen = adminRegDTO.getGen();
			
				//creating an object
				adminRegBO = new AdminRegBO();
				adminRegBO.setFname(fname);
				adminRegBO.setLname(lname);
				adminRegBO.setLname(uname);
				adminRegBO.setEmail(email);
				adminRegBO.setPass(pass);
				adminRegBO.setConfirmpass(confirmpass);
				adminRegBO.setMobno(mobno);
				adminRegBO.setGen(gen);
			
				//creating an object for the RegistrationDao
				adminRegDAO = new AdminRegDAO();
				flag = adminRegDAO.insertData(adminRegBO);
			}
			if(flag == 0)
				return false;
			else
				return true;
		}
		else
		 return false;
	}
}