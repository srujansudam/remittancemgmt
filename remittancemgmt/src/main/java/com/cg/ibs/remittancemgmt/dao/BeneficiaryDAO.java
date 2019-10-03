package com.cg.ibs.remittancemgmt.dao;

import java.math.BigInteger;
import java.util.ArrayList;

import com.cg.ibs.remittancemgmt.bean.Beneficiary;

public interface BeneficiaryDAO {

	public ArrayList<Beneficiary> getDetails(String UCI);

	public void copyDetails(Beneficiary beneficiary);

	public boolean updateDetails(BigInteger accountNumber);

	public boolean deleteDetails(BigInteger accountNumber);

}
