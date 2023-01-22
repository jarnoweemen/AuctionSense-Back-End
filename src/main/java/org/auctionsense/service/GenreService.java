package org.auctionsense.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.auctionsense.domain.Genre;
import org.auctionsense.repository.GenreRepository;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class GenreService {
    @Inject
    GenreRepository genreRepository;

    public Uni<List<Genre>> allGenres()
    {
        return genreRepository.listAll();
    }
}
