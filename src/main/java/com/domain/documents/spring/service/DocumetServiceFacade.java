/**
 *
 */
package com.domain.documents.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.documents.java.model.Document;
import com.domain.documents.java.model.Type;
import com.domain.documents.java.service.DocumentService;
import com.domain.documents.spring.data.DocumentDAO;
import com.domain.documents.spring.social.DocumentTweet;

/**
 * @author Rantidev Singh
 *
 */
@Service("documentFacade")
public class DocumetServiceFacade implements DocumentService {

	@Autowired
	DocumentDAO documentDAO;

	@Autowired
	DocumentTweet documentTweet;

	public List<Document> getAllDocuments(){
		return documentDAO.getAll();
	}

	public Document saveDocument(String id, Document document) {
		Document documentResult = documentDAO.save(id, document);

		if("WEB".equals(documentResult.getType().getName())){
			StringBuilder tweetText = new StringBuilder("My Documents App - A Book update: ");
		 	tweetText.append(documentResult.getName());
		 	tweetText.append(". Check it out: ");
			tweetText.append(documentResult.getLocation());
			documentTweet.tweet(tweetText.toString());
		}
		return documentResult;
	}

	public Document removeDocumentById(String id) {
		return documentDAO.removeById(id);
	}

	public Document findDocumentById(String id){
		return documentDAO.findById(id);
	}

	public boolean updateLocationFromDocumentId(String documentId, String location) {
		Document document = documentDAO.findById(documentId);
		if(null == document)
			return false;
		document.setLocation(location);
		saveDocument(documentId, document);
		return true;
	}

	public List<Document> findByType(Type type) {
		return documentDAO.findByTypeName(type.getName());
	}

}
