package com.example.tournamentcms.module.category.service;

import com.example.tournamentcms.module.category.model.Category;

import java.util.List;

public interface CategoryService {

    public void save(Category category);

    public Category findById(Integer id);

    public void update(Category category);

    public List<Category> findAll();

    public void deleteById(Integer id);

    public List<Category> findByModuleId(int module_id);

    public List<Category> getModuleCategoriesByName(String string);
}
