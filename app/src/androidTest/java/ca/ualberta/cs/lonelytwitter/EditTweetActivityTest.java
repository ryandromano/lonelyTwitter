package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

/**
 * Created by ryand on 2018-03-02.
 */

public class EditTweetActivityTest extends ActivityInstrumentationTestCase2<EditTweetActivity> {
    private Solo solo;

    public EditTweetActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.EditTweetActivity.class);
    }

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();
    }

    public void testEditDisplay() {
        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        assertTrue(solo.waitForText("Test Tweet!"));
    }
}
