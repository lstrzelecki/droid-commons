package com.sozix.android;

import android.content.Context;
import roboguice.application.RoboApplication;

/**
 * @author Lukasz Strzelecki
 * @since 0.0.1
 */
public abstract class AbstractApp extends RoboApplication {

	protected static Context applicationContext;

	public static Context getCtx() {
		return applicationContext;
	}

	public static String getStringByResId(int stringResId) {
		return applicationContext.getString(stringResId);
	}

	public static boolean getBooleanByResId(int booleanResId) {
		return applicationContext.getResources().getBoolean(booleanResId);
	}

	public abstract void synchronizedOnCreateOperations();

	@Override
	public void onCreate() {
		super.onCreate();
		synchronized (this) {
			if (applicationContext == null) {
				applicationContext = getApplicationContext();
				synchronizedOnCreateOperations();
			}
		}
	}
}
