package com.nacre.ofd.delegates;

import com.nacre.ofd.dto.CustomerLoginDTO;
import com.nacre.ofd.service.CustomerLoginService;
import com.nacre.ofd.vo.CustomerLoginVO;

public class CustomerLoginDelegates {
	String uname, pswd;
	long mobno;
	//In this method we are going to parse the variables according to the original format.
	public boolean parsingVariables(CustomerLoginVO customerLoginVO) {
		
		CustomerLoginDTO customerLoginDTO =  null;
		CustomerLoginService customerLoginService = null;
		
		boolean flag = false;
		
		//parsing & storing the variable values from adminRegVO object.
		mobno = Long.parseLong(customerLoginVO.getMobno());
		uname = customerLoginVO.getUname();
		pswd = customerLoginVO.getPswd();
		
		
		//Encapsulating the variable values(DTO)
		customerLoginDTO = new CustomerLoginDTO();
		customerLoginDTO.setUname(uname);
		customerLoginDTO.setPswd(pswd);
		customerLoginDTO.setMobno(mobno);

		//passing the variable values to the next level to perform the operations according to the rules.
		customerLoginService = new CustomerLoginService();
		flag = customerLoginService.registeration(customerLoginDTO);
		return flag;
	}
}
