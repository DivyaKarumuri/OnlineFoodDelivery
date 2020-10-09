package com.nacre.ofd.delegates;

import com.nacre.ofd.dto.AdminLoginDTO;
import com.nacre.ofd.service.AdminLoginService;
import com.nacre.ofd.vo.AdminLoginVO;

public class AdminLoginDelegates {
	String uname, pswd;
	long mobno;
	//In this method we are going to parse the variables according to the original format.
	public boolean parsingVariables(AdminLoginVO adminLoginVO) {
		
		AdminLoginDTO adminLoginDTO =  null;
		AdminLoginService adminLoginService = null;
		
		boolean flag = false;
		
		//parsing & storing the variable values from adminRegVO object.
		mobno = Long.parseLong(adminLoginVO.getMobno());
		uname = adminLoginVO.getUname();
		pswd = adminLoginVO.getPswd();
		
		
		//Encapsulating the variable values(DTO)
		adminLoginDTO = new AdminLoginDTO();
		adminLoginDTO.setUname(uname);
		adminLoginDTO.setPswd(pswd);
		adminLoginDTO.setMobno(mobno);

		//passing the variable values to the next level to perform the operations according to the rules.
		adminLoginService = new AdminLoginService();
		flag = adminLoginService.registeration(adminLoginDTO);
		return flag;
	}
}
