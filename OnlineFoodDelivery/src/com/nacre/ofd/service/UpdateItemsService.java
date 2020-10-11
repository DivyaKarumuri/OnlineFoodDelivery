package com.nacre.ofd.service;

import com.nacre.ofd.bo.UpdateItemsBO;
import com.nacre.ofd.dao.UpdateItemsDAO;
import com.nacre.ofd.dto.UpdateItemsDTO;
import com.nacre.ofd.serviceI.serviceUpdate;

public class UpdateItemsService implements serviceUpdate{
	double price, discount;
	int itemID, deliveryCharges;
	
	@Override
	public boolean updateItem(UpdateItemsDTO updateItemsDTO) {
		UpdateItemsBO updateItemsBO = null;
		UpdateItemsDAO updateItemsDAO = null;
		int flag = 0;
		//Business logic & storing the variable values from adminRegDTO object.
		itemID = updateItemsDTO.getItemID();
		deliveryCharges = updateItemsDTO.getDeliveryCharges();
		price = updateItemsDTO.getPrice();
		discount = updateItemsDTO.getDiscount();
		
		//creating an object
		updateItemsBO = new UpdateItemsBO();
		updateItemsBO.setDeliveryCharges(deliveryCharges);
		updateItemsBO.setPrice(price);
		updateItemsBO.setItemID(itemID);
		updateItemsBO.setDiscount(discount);
		//creating an object for the RegistrationDao
		updateItemsDAO = new UpdateItemsDAO();
		flag = updateItemsDAO.updateData(updateItemsBO);
		if(flag == 0)
			return false;
		else
			return true;
	}
}
