package com.gl.caseStudy4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.caseStudy4.bean.Bill;
import com.gl.caseStudy4.dao.BillRepository;

@Service
public class BillService {
	@Autowired
	private BillRepository repo;
	
	public Long generateId() {
		Long val = repo.findMaxBillId();
		if(val==null)
			val=100001L;
		else
			val=val+1;
		return val;
	}

	public void billSave(Bill bill) {
		repo.save(bill);
	}
}
