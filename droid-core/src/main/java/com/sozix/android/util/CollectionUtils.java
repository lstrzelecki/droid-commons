package com.sozix.android.util;

import java.util.Collection;

/**
 * @author Lukasz Strzelecki
 * @since 0.0.1
 */
public class CollectionUtils {

	public static boolean hasSize(Collection<? extends Object> source, int expectedSize) {
		if (source == null) {
			return false;
		}
		return source.size() == expectedSize;
	}

}
