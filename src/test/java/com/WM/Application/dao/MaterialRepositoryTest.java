package com.WM.Application.dao;

import com.WM.Application.entity.Material;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MaterialRepositoryTest {
    @Autowired
    private MaterialRepository materialRepository;

    @Test
    public void printMaterials() {
        List<Material> materials =
                materialRepository.findAll();

        System.out.println("materials = " + materials);
    }

}