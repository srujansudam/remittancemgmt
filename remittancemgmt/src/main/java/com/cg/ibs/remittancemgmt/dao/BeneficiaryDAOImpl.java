package com.cg.ibs.remittancemgmt.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.cg.ibs.remittancemgmt.bean.Beneficiary;
import com.cg.ibs.remittancemgmt.bean.Customer;

public class BeneficiaryDAOImpl implements BeneficiaryDAO {
	Customer customer = new Customer();
	Map<String, Customer> finalMap = new HashMap<>();
	Set<Beneficiary> savedBeneficiaries = new HashSet<>();
	Beneficiary beneficiary = new Beneficiary();

	@Override
	public ArrayList<Beneficiary> getDetails(String UCI) {
		// TODO Auto-generated method stub
		return finalMap.get(UCI).getSavedBeneficiaries();
	}

	@Override
	public void copyDetails(Beneficiary beneficiary) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updateDetails(BigInteger accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDetails(BigInteger accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
