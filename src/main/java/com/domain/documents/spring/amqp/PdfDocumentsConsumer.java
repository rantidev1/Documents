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
@Component("pdfConsumer")
public class PdfDocumentsConsumer implements RabbitMQConsumer{
	private static final Logger log = LoggerFactory.getLogger(PdfDocumentsConsumer.class);

	public void process(Document document) {
		log.debug("PDF Document received: " + document);
	}

}
