package com.nacre.ofd.service;

import com.nacre.ofd.bo.DeleteItemsBO;
import com.nacre.ofd.dao.DeleteItemsDAO;
import com.nacre.ofd.dto.DeleteItemsDTO;
import com.nacre.ofd.serviceI.serviceDelete;

public class DeleteItemsService implements serviceDelete{
	String itemName, resName;
	double price;
	int itemID;
	
	@Override
	public boolean deleteItem(DeleteItemsDTO deleteItemsDTO) {
		DeleteItemsBO deleteItemsBO = null;
		DeleteItemsDAO deleteItemsDAO = null;
		int flag = 0;
		//Business logic & storing the variable values from adminRegDTO object.
		itemID = deleteItemsDTO.getItemID();
		itemName = deleteItemsDTO.getItemName();
		price = deleteItemsDTO.getPrice();
		resName = deleteItemsDTO.getResName();
		
		//creating an object
		deleteItemsBO = new DeleteItemsBO();
		deleteItemsBO.setItemName(itemName);
		deleteItemsBO.setPrice(price);
		deleteItemsBO.setItemID(itemID);
		deleteItemsBO.setResName(resName);
		//creating an object for the RegistrationDao
		deleteItemsDAO = new DeleteItemsDAO();
		flag = deleteItemsDAO.deleteData(deleteItemsBO);
		if(flag == 0)
			return false;
		else
			return true;
	}
}
