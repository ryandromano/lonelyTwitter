package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private TextView tweetView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        tweetView = (TextView) findViewById(R.id.textView);
        tweetView.setText(LonelyTwitterActivity.tweetMessage.getMessage());
    }
}
