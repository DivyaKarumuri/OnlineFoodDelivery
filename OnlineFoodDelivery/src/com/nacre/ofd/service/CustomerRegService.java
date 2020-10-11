package com.nacre.ofd.service;

import com.nacre.ofd.bo.CustomerRegBO;
import com.nacre.ofd.dao.CustomerRegDAO;
import com.nacre.ofd.dto.CustomerLoginDTO;
import com.nacre.ofd.dto.CustomerRegDTO;
import com.nacre.ofd.serviceI.serviceCusReg;

public class CustomerRegService implements serviceCusReg{
	String fname, lname, email, pswd, pswd1, uname, gen, country, state, city, hno, rname, dob;
	long mobno,pincode;
	@Override
	public boolean registeration(CustomerRegDTO customerRegDTO) {
		
		CustomerRegBO customerRegBO = null;
		CustomerRegDAO customerRegDAO = null;
		int flag = 0;
		//Business logic
		if(customerRegDTO.getPswd().equals(customerRegDTO.getPswd1())) {
				//storing the variable values from adminRegDTO object.
				mobno = customerRegDTO.getMobno();
				pincode = customerRegDTO.getPincode();
				dob = customerRegDTO.getDob();
				
				fname = customerRegDTO.getFname();
				lname = customerRegDTO.getLname();
				uname = customerRegDTO.getUname();
				pswd = customerRegDTO.getPswd();
				pswd1 = customerRegDTO.getPswd1();
				email = customerRegDTO.getEmail();
				gen = customerRegDTO.getGen();
				country = customerRegDTO.getCountry();
				state = customerRegDTO.getState();
				hno = customerRegDTO.getHno();
				rname = customerRegDTO.getRname();
				city = customerRegDTO.getCity();
				
			
				//creating an object
				customerRegBO = new CustomerRegBO();
				customerRegBO.setFname(fname);
				customerRegBO.setLname(lname);
				customerRegBO.setUname(uname);
				customerRegBO.setPswd(pswd);
				customerRegBO.setPswd1(pswd1);
				customerRegBO.setEmail(email);
				customerRegBO.setMobno(mobno);
				customerRegBO.setDob(dob);
				customerRegBO.setGen(gen);
				customerRegBO.setCountry(country);
				customerRegBO.setState(state);
				customerRegBO.setHno(hno);
				customerRegBO.setRname(rname);
				customerRegBO.setCity(city);
				customerRegBO.setPincode(pincode);
				
			
				//creating an object for the RegistrationDao
				customerRegDAO = new CustomerRegDAO();
				flag = customerRegDAO.insertData(customerRegBO);
			
				if(flag == 0)
					return false;
				else
					return true;
		}
		else
		 return false;
	}
}
