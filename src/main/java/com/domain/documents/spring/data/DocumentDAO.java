/**
 *
 */
package com.domain.documents.spring.data;

import java.util.List;

import com.domain.documents.java.model.Document;

/**
 * @author Rantidev Singh
 *
 */
public interface DocumentDAO {
	public List<Document> getAll();
	public Document save(String id, Document document);
	public Document findById(String id);
	public Document removeById(String id);
	public List<Document> findByTypeName(String name);
}
