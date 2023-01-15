package org.auctionsense.service;

import java.util.List;

import javax.inject.Inject;

import org.auctionsense.domain.Category;
import org.auctionsense.repository.CategoryRepository;

import io.smallrye.mutiny.Uni;

public class CategoryService {
    @Inject
    CategoryRepository categoryRepository;

    public CategoryService() {
    }

    public Uni<List<Category>> allCategories()
    {
        return categoryRepository.listAll();
    }
}
