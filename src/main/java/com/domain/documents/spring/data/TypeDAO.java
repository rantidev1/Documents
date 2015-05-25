/**
 *
 */
package com.domain.documents.spring.data;

import java.util.List;

import com.domain.documents.java.model.Type;

/**
 * @author Rantidev Singh
 *
 */
public interface TypeDAO {
	public List<Type> getAll();
	public Type findById(String id);
	public Type save(Type type);
}
