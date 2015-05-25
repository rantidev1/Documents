/**
 *
 */
package com.domain.documents.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.documents.java.model.Type;
import com.domain.documents.java.service.TypeService;
import com.domain.documents.spring.data.TypeDAO;

/**
 * @author Rantidev Singh
 *
 */
@Service("typeFacade")
public class TypeServiceFacade implements TypeService {

	@Autowired
	TypeDAO typeDAO;

	@Override
	public void createNewType(Type type) {
		throw new UnsupportedOperationException("Not yet implemented");
	}


	@Override
	public void updateType(Type type) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public void removeTypeById(String id) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public List<Type> getAllDefinedTypes() {
		return typeDAO.getAll();
	}

	@Override
	public Type getTypeById(String id) {
		return typeDAO.findById(id);
	}

}
