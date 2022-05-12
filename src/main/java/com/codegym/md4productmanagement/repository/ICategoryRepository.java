package com.codegym.md4productmanagement.repository;

import com.codegym.md4productmanagement.model.Category;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
