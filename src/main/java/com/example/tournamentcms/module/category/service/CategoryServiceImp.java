package com.example.tournamentcms.module.category.service;

import com.example.tournamentcms.core.util.pagination.StringUtils;
import com.example.tournamentcms.module.category.model.Category;
import com.example.tournamentcms.module.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void save(Category category) {

        category.setSlug(StringUtils.slugify(category.getName()));

        category.setDeleteLock(0);

        categoryRepository.save(category);
    }

    @Override
    public Category findById(Integer id) {

        return categoryRepository.findById(id);
    }

    @Override
    public void update(Category category) {

        category.setSlug(StringUtils.slugify(category.getName()));

        categoryRepository.update(category.getId(), category.getName(), category.getSlug(), category.getModule(), category.getParentId());

    }

    @Override
    public List<Category> findAll() {

        return categoryRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {

        categoryRepository.delete(id);

    }

    public List<Category> findByModuleId(int module_id) {
        return categoryRepository.findByModuleId(module_id);
    }

    @Override
    public List<Category> getModuleCategoriesByName(String moduleName) {
        return categoryRepository.getModuleCategoriesByName(moduleName);
    }
}
