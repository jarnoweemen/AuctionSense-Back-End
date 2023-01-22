package org.auctionsense.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.auctionsense.domain.Product;
import org.auctionsense.repository.ProductRepository;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class ProductService {
    @Inject
    ProductRepository productRepository;

    public Uni<List<Product>> allProductsByCategory(String name) {
        return productRepository.allProductsByCategory(name);
    }
}
