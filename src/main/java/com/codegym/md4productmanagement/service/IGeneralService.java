package com.codegym.md4productmanagement.service;

import com.codegym.md4productmanagement.model.Product;
import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void removeById(Long id);

}
