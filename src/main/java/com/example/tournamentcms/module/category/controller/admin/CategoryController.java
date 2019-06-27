package com.example.tournamentcms.module.category.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.tournamentcms.module.module.*;

@Controller
@RequestMapping(value ="/admin/category")
public class CategoryController {

    @Autowired

    private CategoryService categoryService;

    @Autowired
    private ModuleService moduleService;

    private final String MODULE_TEMPLATE_ROOT = "admin/module/category";
}
