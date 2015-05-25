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
public interface SearchEngine {

	public List<Document> findByType(Type documentType);

	public List<Document> listAll();

	public List<Document> findByLocation(String location);

	public Document findById(String id);
}
