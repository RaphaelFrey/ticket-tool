package com.chixsaw.tickettool.services;

import java.util.Set;

/**
 * Created by Raphael Frey on 04.12.2022
 */
public interface CrudService<T, Id> {

    Set<T> findAll();
    T findById(Id id);
    T save(T object);
    void delete(T object);
    void deleteById(Id id);
}
