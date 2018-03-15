package ca.ualberta.cs.lonelytweet;

import android.util.Log;

import java.io.Serializable;
import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet implements Serializable {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		//Log.i("importantLonelyTweet", getTweetDate() + " | " + getTweetBody() );
		String string = getTweetDate() + " | " + getTweetBody();
		Log.i("importantLonelyTweet", string);
		return string;
	}

	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}