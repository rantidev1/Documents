/**
 *
 */
package com.domain.documents.spring.social;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Component;

/**
 * @author Rantidev Singh
 *
 */
@Component("documentTweet")
public class DocumentTweet {

	@Autowired
	Twitter tweet;

	public void tweet(String text){
		tweet.timelineOperations().updateStatus(text);
	}
}
