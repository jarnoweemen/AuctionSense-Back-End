package org.auctionsense.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.auctionsense.repository.ProductRepository;

@ApplicationScoped
public class ProductService {
    @Inject
    ProductRepository productRepository;

}
