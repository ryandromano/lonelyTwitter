package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        //LAB Refactoring
        //Code Style Issues
        // - Changed the tweetview to be a local variable
        //      - tweetView is only used in this one method and doesn't need to be made global
        TextView tweetView = (TextView) findViewById(R.id.textView);
        tweetView.setText(LonelyTwitterActivity.tweetMessage.getMessage());
    }
}
