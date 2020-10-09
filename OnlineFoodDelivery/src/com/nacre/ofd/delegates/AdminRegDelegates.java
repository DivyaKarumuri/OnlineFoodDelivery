package com.nacre.ofd.delegates;

import com.nacre.ofd.dto.AdminRegDTO;
import com.nacre.ofd.service.AdminRegService;
import com.nacre.ofd.vo.AdminRegVO;

public class AdminRegDelegates {
	String fname, lname, uname, email, pass, confirmpass, gen;
	long mobno;
	//In this method we are going to parse the variables according to the original format.
	public boolean parsingVariables(AdminRegVO adminRegVO) {
		
		AdminRegDTO adminRegDTO =  null;
		AdminRegService rs = null;
		
		boolean flag = false;
		
		//parsing & storing the variable values from adminRegVO object.
		mobno = Long.parseLong(adminRegVO.getMobno());
		
		fname = adminRegVO.getFname();
		lname = adminRegVO.getLname();
		uname = adminRegVO.getUname();
		pass = adminRegVO.getPass();
		confirmpass = adminRegVO.getConfirmpass();
		email = adminRegVO.getEmail();
		gen = adminRegVO.getGen();
		
		//Encapsulating the variable values(DTO)
		adminRegDTO = new AdminRegDTO();
		adminRegDTO.setFname(fname);
		adminRegDTO.setLname(lname);
		adminRegDTO.setUname(uname);
		adminRegDTO.setPass(pass);
		adminRegDTO.setConfirmpass(confirmpass);
		adminRegDTO.setEmail(email);
		adminRegDTO.setGen(gen);
		adminRegDTO.setMobno(mobno);
				
		//passing the variable values to the next level to perform the operations according to the rules.
		rs = new AdminRegService();
		flag = rs.registeration(adminRegDTO);
		return flag;
	}
}