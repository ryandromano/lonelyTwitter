package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public interface Tweetable {
    //LAB Refactoring
    //Code Style Issues
    // - Removed the public modifier from "public String getMessage();" and
    //   "public Date getDate();"
    // - Since tweetable is an interface, the modifiers are not necessary and
    //   can be removed without an issue.
    String getMessage();

    Date getDate();

}
