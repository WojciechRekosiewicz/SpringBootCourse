package com.mygroup.springbootcourse.service;

import com.mygroup.springbootcourse.persistence.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Collection;


public interface BaseService<T extends BaseEntity, K extends Serializable, R extends JpaRepository<T, K>> {
    //CRUD

    R getRepository();

    T save(T entity);

    T delete(K id);

    Collection<T> getAll();

    T getOne(K id);

}