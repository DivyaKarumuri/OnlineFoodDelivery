package com.nacre.ofd.delegates;

import com.nacre.ofd.dto.PaymentDto;
import com.nacre.ofd.service.DeleteItemsService;
import com.nacre.ofd.service.PaymentServiceImplementation;
import com.nacre.ofd.vo.PaymentVo;;

public class PaymentDelegates {
	String payment,validThru,cardName;
	long cardNumber;
	int cvv;
	public boolean parseVariable(PaymentVo paymentVo) {
		boolean flag = false;
		PaymentDto paymentDTO = null;
		PaymentServiceImplementation paymentService = null;
		
		cardNumber = Long.parseLong(paymentVo.getCardnumber());
		cvv = Integer.parseInt(paymentVo.getCvv());
		payment = paymentVo.getPayment();
		validThru = paymentVo.getValidThru();
		cardName = paymentVo.getCardname();
		
		paymentDTO = new PaymentDto();
		paymentDTO.setPayment(payment);
		paymentDTO.setCardName(cardName);
		paymentDTO.setCardNumber(cardNumber);
		paymentDTO.setValidThru(validThru);
		paymentDTO.setCvv(cvv);
		//System.out.println("delegates"+payment+"\t"+cardName+"\t"+cardNumber+"\t"+validThru+"\t"+cvv);
		paymentService = new PaymentServiceImplementation();
		flag = paymentService.payment(paymentDTO);
		return flag;
		
	}
}