package com.cg.ibs.remittancemgmt.dao;

import java.math.BigInteger;
import java.util.List;

import com.cg.ibs.remittancemgmt.bean.CreditCard;

public interface CreditCardDAO {
	public List<CreditCard> getDetails();

	public boolean copyDetails(CreditCard card);

	public boolean updateDetails(BigInteger cardNumber);

	public boolean deleteDetails(BigInteger cardNumber);
}
