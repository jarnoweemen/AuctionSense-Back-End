package org.auctionsense.repository;

import javax.enterprise.context.ApplicationScoped;

import org.auctionsense.domain.Product;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product> {
    
}
