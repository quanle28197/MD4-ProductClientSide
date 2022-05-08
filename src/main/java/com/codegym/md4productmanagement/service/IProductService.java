package com.codegym.md4productmanagement.service;

import com.codegym.md4productmanagement.model.Product;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product>  findProductByNameContaining(String name);
}
