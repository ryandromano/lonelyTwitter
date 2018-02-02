/*
 * NormalTweet
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
 * Represents a normal tweet.
 *
 * @author rromano
 * @see Tweet
 *
 */
public class NormalTweet extends Tweet {
    /**
     * Constructs a tweet object from Tweet class
     *
     * @param message tweet message
     */
    NormalTweet(String message){
        super(message);

    }

    /**
     * Constructs a tweet object from Tweet class
     *
     * @param message tweet message
     * @param date tweet date
     */
    NormalTweet(String message, Date date){
        super(message,date);
    }

    /**
     * Sets whether or not the tweet is important
     *
     * @return returns false as this just a normal tweet
     */
    @Override
    public boolean isImportant(){
        return false;
    }
}
