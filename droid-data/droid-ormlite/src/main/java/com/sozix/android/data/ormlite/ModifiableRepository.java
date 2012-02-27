package com.sozix.android.data.ormlite;

import java.util.List;

/**
 * @author Lukasz Strzelecki
 * @since 0.0.1
 */
public interface ModifiableRepository<E, PK> {

	E persist(E entity);

	List<E> persist(List<E> entities);

	void remove(E entity);

	void remove(List<E> entity);

	void removeAll();
}
