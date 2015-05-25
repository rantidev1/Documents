/**
 *
 */
package com.domain.documents.java.service;

import java.util.List;

import com.domain.documents.java.model.Document;
import com.domain.documents.java.model.Type;

/**
 * @author Rantidev Singh
 *
 */
public interface DocumentService {
	public List<Document> getAllDocuments();
	public Document findDocumentById(String id);
	public Document saveDocument(String id, Document document);
	public Document removeDocumentById(String id);
	public List<Document> findByType(Type type);
	public boolean updateLocationFromDocumentId(String documentId, String location);
}
