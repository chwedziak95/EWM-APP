package com.WM.Application.controller;

import com.WM.Application.dao.MaterialRepository;
import com.WM.Application.entity.Material;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/materials")
public class MaterialController {
    private final MaterialRepository materialRepository;

    public MaterialController(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @GetMapping
    public List<Material> getMaterials(){
        return materialRepository.findAllWIthMaterialCategory();
    }
}
