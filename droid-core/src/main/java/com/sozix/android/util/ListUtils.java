package com.sozix.android.util;

import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Mateusz Strzelecki
 * @since 0.0.1
 */
public class ListUtils {
	public static <E> E getLast(List<E> list) {
		if (CollectionUtils.isEmpty(list)) {
			throw new IllegalArgumentException("Given list should not be null or empty");
		}
		int size = list.size();
		int lastIndex = size - 1;

		E lastElement = list.get(lastIndex);
		return lastElement;
	}

	public static <E> E getFirst(List<E> list, E defaultValue) {
		E result;
		if (CollectionUtils.isEmpty(list)) {
			result = defaultValue;
		} else {
			int first = 0;
			result = list.get(first);
		}
		return result;
	}
}
