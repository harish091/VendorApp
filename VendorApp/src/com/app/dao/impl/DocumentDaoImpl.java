package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IDocumentDao;
import com.app.model.Document;;
@Repository
public class DocumentDaoImpl implements IDocumentDao{
	@Autowired
	private HibernateTemplate ht;


	@Override
	public int saveDocument(Document file) {
		return (Integer)ht.save(file);
	}

	@Override
	public List<Object[]> getIdAndNamesOnly() {
		String hql="select fileId,fileName from "+Document.class.getName();
		//ClassName.class.getName()=>Full className
		List<Object[]> arrList=ht.find(hql);
		return arrList;
	}	

	@Override
	public Document getObjetById(int fileId) {
		return ht.get(Document.class, fileId);
	}

}
