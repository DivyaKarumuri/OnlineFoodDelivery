package com.nacre.ofd.delegates;

import com.nacre.ofd.dto.CustomerRegDTO;
import com.nacre.ofd.service.CustomerRegService;
import com.nacre.ofd.vo.CustomerRegVO;

public class CustomerRegDelegates {
	String fname, lname, uname, email, pswd, pswd1, gen, country, state, hno, rname, city,dob;
	long mobno, pincode;
	//In this method we are going to parse the variables according to the original format.
	public boolean parsingVariables(CustomerRegVO customerRegVO) {
		
		CustomerRegDTO customerRegDTO =  null;
		CustomerRegService customerRegService = null;
		
		boolean flag = false;
		
		//parsing & storing the variable values from adminRegVO object.
		mobno = Long.parseLong(customerRegVO.getMobno());
		pincode = Long.parseLong(customerRegVO.getPincode());
		dob = customerRegVO.getDob();
		
		fname = customerRegVO.getFname();
		lname = customerRegVO.getLname();
		uname = customerRegVO.getUname();
		pswd = customerRegVO.getPswd();
		pswd1 = customerRegVO.getPswd1();
		email = customerRegVO.getEmail();
		gen = customerRegVO.getGen();
		country = customerRegVO.getCountry();
		state = customerRegVO.getState();
		hno = customerRegVO.getHno();
		rname = customerRegVO.getRname();
		city = customerRegVO.getCity();
		
		
		//Encapsulating the variable values(DTO)
		customerRegDTO = new CustomerRegDTO();
		customerRegDTO.setFname(fname);
		customerRegDTO.setLname(lname);
		customerRegDTO.setUname(uname);
		customerRegDTO.setPswd(pswd);
		customerRegDTO.setPswd1(pswd1);
		customerRegDTO.setEmail(email);
		customerRegDTO.setMobno(mobno);
		customerRegDTO.setDob(dob);
		customerRegDTO.setGen(gen);
		customerRegDTO.setCountry(country);
		customerRegDTO.setState(state);
		customerRegDTO.setHno(hno);
		customerRegDTO.setRname(rname);
		customerRegDTO.setCity(city);
		customerRegDTO.setPincode(pincode);
		
		//passing the variable values to the next level to perform the operations according to the rules.
		customerRegService = new CustomerRegService();
		flag = customerRegService.registeration(customerRegDTO);
		return flag;
	}
}
