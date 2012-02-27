package com.sozix.android.util;

/**
 * @author Lukasz Strzelecki
 * @since 0.0.1
 */
public class StringUtils {

	public static boolean isBlank(String s) {
		return s == null || s.trim().length() == 0;
	}

	public static boolean isNotBlank(String s) {
		return !isBlank(s);
	}
}
