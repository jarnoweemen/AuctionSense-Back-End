package org.auctionsense.repository;

import javax.enterprise.context.ApplicationScoped;

import org.auctionsense.domain.Category;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;

@ApplicationScoped
public class CategoryRepository implements PanacheRepository<Category> {
    
}
