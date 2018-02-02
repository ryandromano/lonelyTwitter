/*
 * Tweetable
 *
 * January 31, 2018
 *
 * Copyright © 2018 Team X. CMPUT 301. University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license un this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * An interface for retrieving and setting a tweet message
 */
public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;
}
