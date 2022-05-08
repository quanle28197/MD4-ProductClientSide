package com.codegym.md4productmanagement.service;

import com.codegym.md4productmanagement.model.Product;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.Optional;

public interface IGeneralService<T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    Product save(T t);

    void remove(Long id);
}
