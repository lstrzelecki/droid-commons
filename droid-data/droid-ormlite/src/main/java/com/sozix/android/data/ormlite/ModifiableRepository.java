package com.sozix.android.data.ormlite;

import java.util.Collection;

/**
 * @author Lukasz Strzelecki
 * @since 0.0.1
 */
public interface ModifiableRepository<E, PK> {

	E persist(E entity);

	Collection<E> persist(Collection<E> entities);

	void remove(E entity);

	void remove(Collection<E> entity);

	void removeAll();

    void removeByPrimaryKey(PK id);
}
