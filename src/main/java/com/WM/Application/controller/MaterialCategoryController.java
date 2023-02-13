package com.WM.Application.controller;

import com.WM.Application.dao.MaterialCategoryRepository;
import com.WM.Application.entity.MaterialCategory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/material-category")
public class MaterialCategoryController {
    private final MaterialCategoryRepository materialCategoryRepository;

    public MaterialCategoryController(MaterialCategoryRepository materialCategoryRepository) {
        this.materialCategoryRepository = materialCategoryRepository;
    }

    @GetMapping
    public List<MaterialCategory> getMaterialCategory(){
        return materialCategoryRepository.findAll();
    }
}
