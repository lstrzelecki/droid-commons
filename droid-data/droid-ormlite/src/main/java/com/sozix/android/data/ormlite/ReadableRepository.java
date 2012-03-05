package com.sozix.android.data.ormlite;

import java.util.Collection;
import java.util.List;

/**
 * @author Lukasz Strzelecki
 * @since 0.0.1
 */
public interface ReadableRepository<E, PK> {

	E readByPrimaryKey(PK key);

	List<E> readAll();

	long count();

	void refresh(Collection<E> entity);

	void refresh(E entity);

	public boolean exists(PK id);
}
