/**
 *
 */
package com.domain.documents.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.domain.documents.java.service.DocumentService;
import com.domain.documents.java.service.TypeService;
import com.domain.documents.java.model.Document;
import com.domain.documents.java.model.Type;
import com.domain.documents.spring.social.DocumentTweet;

/**
 * @author Rantidev Singh
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/mydocuments-context.xml","classpath:META-INF/spring/mydocuments-mongo-context.xml"})
public class MyDocumentsTest {
	private static final Logger log = LoggerFactory.getLogger(MyDocumentsTest.class);
	//The ID was taken from the src/main/resources/META-INF/data/data.sql
	private final String WEB_TYPE_ID = "4980d2e4-a424-4ff4-a0b2-476039682f43";
	@Autowired
	DocumentTweet documentTweet;

	@Autowired
	DocumentService documentFacade;

	@Autowired
	TypeService typeFacade;

	@Test
	public void testTwitter(){
		log.debug("Testing Spring Social....");
		assertNotNull(documentTweet);
		documentTweet.tweet("Playing with Spring Social!");
	}

	@Test
	public void testMyDocumentsTwitter(){
		log.debug("Testing My Documents with Spring Social....");
		assertNotNull(documentTweet);
		assertNotNull(typeFacade);


		Document document = new Document();
		document.setName("Beginning Blender");
		document.setType(typeFacade.getTypeById(WEB_TYPE_ID));
		document.setDescription("");
		document.setLocation("http://www.apress.com/9781430262237");

		documentFacade.saveDocument(document.getDocumentId(),document);
	}
}
