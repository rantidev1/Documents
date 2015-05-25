/**
 *
 */
package com.domain.documents.java.service;

import java.util.List;

import com.domain.documents.java.model.Type;

/**
 * @author Rantidev Singh
 *
 */
public interface TypeService {
	public void createNewType(Type type);
	public void updateType(Type type);
	public void removeTypeById(String id);
	public List<Type> getAllDefinedTypes();
	public Type getTypeById(String id);
}
