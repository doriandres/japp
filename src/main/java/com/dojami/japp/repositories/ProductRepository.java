package com.dojami.japp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.dojami.japp.data.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {    
}
