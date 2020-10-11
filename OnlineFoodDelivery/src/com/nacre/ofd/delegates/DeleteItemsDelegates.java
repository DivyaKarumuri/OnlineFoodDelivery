package com.nacre.ofd.delegates;

import com.nacre.ofd.dto.DeleteItemsDTO;
import com.nacre.ofd.service.DeleteItemsService;
import com.nacre.ofd.vo.DeleteItemsVO;

public class DeleteItemsDelegates {
	String itemName, resName;
	double price;
	int itemID;
	//In this method we are going to parse the variables according to the original format.
	public boolean parsingVariables(DeleteItemsVO deleteItemsVO) {
		
		DeleteItemsDTO deleteItemsDTO =  null;
		DeleteItemsService deleteItemsService = null;
		
		boolean flag = false;
		
		//parsing & storing the variable values from adminRegVO object.
		itemID = Integer.parseInt(deleteItemsVO.getItemID());
		itemName = deleteItemsVO.getItemName();
		price = Double.parseDouble(deleteItemsVO.getPrice());
		resName = deleteItemsVO.getResName();
		
		
		
		//Encapsulating the variable values(DTO)
		deleteItemsDTO = new DeleteItemsDTO();
		deleteItemsDTO.setItemName(itemName);
		deleteItemsDTO.setPrice(price);
		deleteItemsDTO.setItemID(itemID);
		deleteItemsDTO.setResName(resName);

		//passing the variable values to the next level to perform the operations according to the rules.
		deleteItemsService = new DeleteItemsService();
		flag = deleteItemsService.deleteItem(deleteItemsDTO);
		return flag;
	}
}
