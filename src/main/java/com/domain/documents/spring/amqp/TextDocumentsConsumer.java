/**
 *
 */
package com.domain.documents.spring.amqp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.domain.documents.java.model.Document;

/**
 * @author Rantidev Singh
 *
 */
@Component("textConsumer")
public class TextDocumentsConsumer implements RabbitMQConsumer{
	private static final Logger log = LoggerFactory.getLogger(TextDocumentsConsumer.class);

	public void process(Document document) {
		log.debug("Text Document received: " + document);
	}

}
