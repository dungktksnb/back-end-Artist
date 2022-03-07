package com.example.artists.service.category;

import com.example.artists.model.Category;
import com.example.artists.service.IGeneralService;

import java.util.Optional;

public class CategoryServices implements IGeneralService<Category> {
    @Override
    public Iterable<Category> findAll() {
        return null;
    }

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
