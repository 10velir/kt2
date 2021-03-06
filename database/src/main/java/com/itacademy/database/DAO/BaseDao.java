package com.itacademy.database.DAO;

import com.itacademy.database.entities.BaseEntity;
import org.hibernate.Session;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import static com.itacademy.database.util.SessionManager.getSession;

public interface BaseDao <T extends Serializable, E extends BaseEntity<T>>  {

    default T save(E entity) {
        Session session = getSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        return entity.getId();
    }

    default Optional<E> getById(T id) {
        return Optional.ofNullable(getSession().get(getClazz(), id));
    }

    default Class<E> getClazz() {
        Type entityType = ((ParameterizedType) getClass().getGenericInterfaces()[0]).getActualTypeArguments()[1];
        return  (Class<E>) entityType;
    }

    default T update(E entity) {
        Session session = getSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        return entity.getId();
    }

    default T delete(E entity) {
        Session session = getSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        return entity.getId();
    }

    default List<E> getAll() {
        Session session = getSession();
        Class<E> clazz = getClazz();
        return session.createQuery(String.format("select e from %s e", clazz.getSimpleName()), clazz).list();
    }
}
