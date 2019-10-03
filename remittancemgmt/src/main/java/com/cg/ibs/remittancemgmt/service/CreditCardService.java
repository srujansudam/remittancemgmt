package com.cg.ibs.remittancemgmt.service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.cg.ibs.remittancemgmt.bean.CreditCard;

public interface CreditCardService {
	public List<CreditCard> showCardDetails();

	public boolean validateCardNumber(BigInteger cardNumber);

	public boolean validateDateOfExpiry(Date dateOfExpiry);

	public boolean validateNameOnCard(String nameOnCard);

	public void modifyCardDetails(BigInteger cardNumber);

	public boolean deleteCardDetails(BigInteger cardNumber);

	public void saveCardDetails(CreditCard card);
}
