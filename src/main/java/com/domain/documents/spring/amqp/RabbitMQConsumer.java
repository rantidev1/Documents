/**
 *
 */
package com.domain.documents.spring.amqp;

import com.domain.documents.java.model.Document;

/**
 * @author Rantidev Singh
 *
 */

public interface RabbitMQConsumer{
	public void process(Document document);
}
