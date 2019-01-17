package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IVendorDao;
import com.app.model.Vendor;
@Repository
public class VendorDaoImpl implements IVendorDao {
     
	@Autowired
	private HibernateTemplate ht;
	@Override
	public int saveVendor(Vendor ven) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(ven);
	}

	@Override
	public void updateVendor(Vendor ven) {
		// TODO Auto-generated method stub
		ht.update(ven);
	}

	@Override
	public void deleteVendor(int venId) {
		// TODO Auto-generated method stub
		ht.delete(new Vendor(venId));
	}

	@Override
	public Vendor getVendorById(int venId) {
		// TODO Auto-generated method stub
		Vendor venObj=ht.get(Vendor.class, venId);
		return venObj;
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		List<Vendor> venList=ht.loadAll(Vendor.class);
		return venList;
	}

}
