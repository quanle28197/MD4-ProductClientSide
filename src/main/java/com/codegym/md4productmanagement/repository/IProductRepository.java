package com.codegym.md4productmanagement.repository;

import com.codegym.md4productmanagement.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}
