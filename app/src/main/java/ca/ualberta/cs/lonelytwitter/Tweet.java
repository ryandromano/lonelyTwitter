/*
 * Tweet
 *
 * January 31, 2018
 *
 * Copyright © 2018 Team X. CMPUT 301. University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license un this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author rromano
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 *
 */
public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
    }


    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets the tweet date
     *
     * @return returns the date associated with that tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     * Gets the tweet message
     *
     * @return returns the message associated with that tweet
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets a tweet message.
     *
     * @param message tweet message.
     * @throws TweetTooLongException thrown if character exceed 160 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets the date of a tweet
     *
     * @param date date of the tweet
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Check to see if the tweet is important or not
     *
     * @return Returns true if the tweet is important or false otherwise
     */
    public abstract boolean isImportant();

    /**
     * Gets the tweet message
     *
     * @return the tweet message
     */
    @Override
    public String toString(){
        return message;
    }
}
