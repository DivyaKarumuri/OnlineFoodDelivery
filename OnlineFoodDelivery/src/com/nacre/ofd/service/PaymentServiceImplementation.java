package com.nacre.ofd.service;

import com.nacre.ofd.bo.PaymentBo;
import com.nacre.ofd.dao.PaymentDaoImpl;
import com.nacre.ofd.dto.PaymentDto;
import com.nacre.ofd.serviceI.PaymentService;

public class PaymentServiceImplementation implements PaymentService {
	String payment,validThru,cardName;
	long cardNumber;
	int cvv;
	@Override
	public boolean payment(PaymentDto paymentDto) {
		PaymentBo paymentBO = null;
		PaymentDaoImpl paymentDAO = null;
		int flag = 0;
		PaymentDto paymentDTO = null;
		PaymentServiceImplementation paymentService = null;
		
		cardNumber = paymentDto.getCardNumber();
		cvv = paymentDto.getCvv();
		payment = paymentDto.getPayment();
		validThru = paymentDto.getValidThru();
		cardName = paymentDto.getCardName();
		
		paymentBO = new PaymentBo();
		paymentBO.setPayment(payment);
		paymentBO.setCardName(cardName);
		paymentBO.setCardNumber(cardNumber);
		paymentBO.setValidThru(validThru);
		paymentBO.setCvv(cvv);
		//System.out.println("divya services"+payment+"\t"+cardName+"\t"+cardNumber+"\t"+validThru+"\t"+cvv);
		paymentDAO = new PaymentDaoImpl();
		flag = paymentDAO.insert(paymentBO);
		if(flag == 0)
			return false;
		else
			return true;	
	}
}