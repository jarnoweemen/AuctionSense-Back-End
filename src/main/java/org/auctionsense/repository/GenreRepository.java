package org.auctionsense.repository;

import javax.enterprise.context.ApplicationScoped;

import org.auctionsense.domain.Genre;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;

@ApplicationScoped
public class GenreRepository implements PanacheRepository<Genre> {
    
}
