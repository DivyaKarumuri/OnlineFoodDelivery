package com.nacre.ofd.delegates;

import com.nacre.ofd.dto.UpdateItemsDTO;
import com.nacre.ofd.service.UpdateItemsService;
import com.nacre.ofd.vo.UpdateItemsVO;

public class UpdateItemsDelegates {
	
	double price, discount;
	int itemID, deliveryCharges;
	//In this method we are going to parse the variables according to the original format.
	public boolean parsingVariables(UpdateItemsVO updateItemsVO) {
		
		UpdateItemsDTO updateItemsDTO =  null;
		UpdateItemsService updateItemsService = null;
		
		boolean flag = false;
		
		//parsing & storing the variable values from adminRegVO object.
		itemID = Integer.parseInt(updateItemsVO.getItemID());
		deliveryCharges = Integer.parseInt(updateItemsVO.getDiscount());
		price = Double.parseDouble(updateItemsVO.getPrice());
		discount = Double.parseDouble(updateItemsVO.getDiscount());
		
		
		
		//Encapsulating the variable values(DTO)
		updateItemsDTO = new UpdateItemsDTO();
		updateItemsDTO.setDiscount(discount);
		updateItemsDTO.setPrice(price);
		updateItemsDTO.setItemID(itemID);
		updateItemsDTO.setDeliveryCharges(deliveryCharges);

		//passing the variable values to the next level to perform the operations according to the rules.
		updateItemsService = new UpdateItemsService();
		flag = updateItemsService.updateItem(updateItemsDTO);
		return flag;
	}
}
