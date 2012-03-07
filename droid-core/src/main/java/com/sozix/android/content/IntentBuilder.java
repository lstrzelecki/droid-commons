package com.sozix.android.content;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;

/**
 * @author Lukasz Strzelecki
 * @since 0.0.1
 */
public class IntentBuilder {

	private Intent intent;

	private Bundle bundle;

	public IntentBuilder(Activity from, Class to) {
		bundle = new Bundle();
		intent = new Intent(from, to);
	}

	public IntentBuilder withSerializable(String key, Serializable object) {
		bundle.putSerializable(key, object);
		return this;
	}

	public IntentBuilder withInt(String key, Integer integer) {
		bundle.putInt(key, integer);
		return this;
	}


	public Intent build() {
		intent.putExtras(bundle);
		return intent;
	}
}
