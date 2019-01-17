package com.app.dao;

import java.util.List;

import com.app.model.Document;;

public interface IDocumentDao {

	public int saveDocument(Document file);
	public List<Object[]> getIdAndNamesOnly();
	public Document getObjetById(int fileId);
	
}
