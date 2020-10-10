package com.nacre.ofd.delegates;

import java.sql.Date;

import com.nacre.ofd.dto.AdminRegDTO;
import com.nacre.ofd.service.AdminRegService;
import com.nacre.ofd.vo.AdminRegVO;

public class AdminRegDelegates {
	
	String fname, lname, uname, email, pswd, pswd1, gen, country, state, hno, rname, city,dob;
	long mobno, pincode;
	//In this method we are going to parse the variables according to the original format.
	public boolean parsingVariables(AdminRegVO adminRegVO) {
		
		AdminRegDTO adminRegDTO =  null;
		AdminRegService adminRegService = null;
		
		boolean flag = false;
		
		//parsing & storing the variable values from adminRegVO object.
		mobno = Long.parseLong(adminRegVO.getMobno());
		pincode = Long.parseLong(adminRegVO.getPincode());
		dob = adminRegVO.getDob();
		
		fname = adminRegVO.getFname();
		lname = adminRegVO.getLname();
		uname = adminRegVO.getUname();
		pswd = adminRegVO.getPswd();
		pswd1 = adminRegVO.getPswd1();
		email = adminRegVO.getEmail();
		gen = adminRegVO.getGen();
		country = adminRegVO.getCountry();
		state = adminRegVO.getState();
		hno = adminRegVO.getHno();
		rname = adminRegVO.getRname();
		city = adminRegVO.getCity();
		
		
		//Encapsulating the variable values(DTO)
		adminRegDTO = new AdminRegDTO();
		adminRegDTO.setFname(fname);
		adminRegDTO.setLname(lname);
		adminRegDTO.setUname(uname);
		adminRegDTO.setPswd(pswd);
		adminRegDTO.setPswd1(pswd1);
		adminRegDTO.setEmail(email);
		adminRegDTO.setMobno(mobno);
		adminRegDTO.setDob(dob);
		adminRegDTO.setGen(gen);
		adminRegDTO.setCountry(country);
		adminRegDTO.setState(state);
		adminRegDTO.setHno(hno);
		adminRegDTO.setRname(rname);
		adminRegDTO.setCity(city);
		adminRegDTO.setPincode(pincode);
		
		//passing the variable values to the next level to perform the operations according to the rules.
		adminRegService = new AdminRegService();
		flag = adminRegService.registeration(adminRegDTO);
		return flag;
	}
}