package com.app.service;

import java.util.List;

import com.app.model.Document;

public interface IDocumentService {

	public int saveDocument(Document file);
	public List<Object[]> getIdAndNamesOnly();
	public Document getObjetById(int fileId);
}
