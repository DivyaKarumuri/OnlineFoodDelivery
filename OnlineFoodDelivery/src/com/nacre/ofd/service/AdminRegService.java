package com.nacre.ofd.service;

import com.nacre.ofd.bo.AdminRegBO;
import com.nacre.ofd.dao.AdminRegDAO;
import com.nacre.ofd.dto.AdminRegDTO;
import com.nacre.ofd.serviceI.serviceReg;

public class AdminRegService implements serviceReg {
	String fname, lname, email, pswd, pswd1, uname, gen, country, state, city, hno, rname, dob;
	long mobno,pincode;
	@Override
	public boolean registeration(AdminRegDTO adminRegDTO) {
		
		AdminRegBO adminRegBO = null;
		AdminRegDAO adminRegDAO = null;
		int flag = 0;
		//Business logic
		if(adminRegDTO.getPswd().equals(adminRegDTO.getPswd1())) {
				//storing the variable values from adminRegDTO object.
				mobno = adminRegDTO.getMobno();
				pincode = adminRegDTO.getPincode();
				dob = adminRegDTO.getDob();
				
				fname = adminRegDTO.getFname();
				lname = adminRegDTO.getLname();
				uname = adminRegDTO.getUname();
				pswd = adminRegDTO.getPswd();
				pswd1 = adminRegDTO.getPswd1();
				email = adminRegDTO.getEmail();
				gen = adminRegDTO.getGen();
				country = adminRegDTO.getCountry();
				state = adminRegDTO.getState();
				hno = adminRegDTO.getHno();
				rname = adminRegDTO.getRname();
				city = adminRegDTO.getCity();
				System.out.println("I am in services");
				System.out.println(fname+" "+lname+" "+uname+" "+email+" "+pswd+" "+pswd1+" "+mobno+" "+dob+" "+gen+" "+country+" "+state+" "+hno+" "+rname+" "+city+" "+pincode);
				
			
				//creating an object
				adminRegBO = new AdminRegBO();
				adminRegBO.setFname(fname);
				adminRegBO.setLname(lname);
				adminRegBO.setUname(uname);
				adminRegBO.setPswd(pswd);
				adminRegBO.setPswd1(pswd1);
				adminRegBO.setEmail(email);
				adminRegBO.setMobno(mobno);
				adminRegBO.setDob(dob);
				adminRegBO.setGen(gen);
				adminRegBO.setCountry(country);
				adminRegBO.setState(state);
				adminRegBO.setHno(hno);
				adminRegBO.setRname(rname);
				adminRegBO.setCity(city);
				adminRegBO.setPincode(pincode);
				
			
				//creating an object for the RegistrationDao
				adminRegDAO = new AdminRegDAO();
				flag = adminRegDAO.insertData(adminRegBO);
			
				if(flag == 0)
					return false;
				else
					return true;
		}
		else
		 return false;
	}
}