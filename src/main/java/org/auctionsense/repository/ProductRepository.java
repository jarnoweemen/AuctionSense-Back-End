package org.auctionsense.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.auctionsense.domain.Product;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product> {
    public Uni<List<Product>> allProductsByCategory(String name) {
        return list("#Products.byCategory", Parameters.with("name", name));
    }
}
