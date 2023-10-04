package com.xingueaqui.api.controller.impl;

import com.xingueaqui.api.controller.ISwearWordCategorieController;
import com.xingueaqui.api.response.SwearWordCategorieResponse;
import com.xingueaqui.api.service.ISwearWordCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/swearword/categorie")
public class SwearWordCategorieControllerImpl implements ISwearWordCategorieController {
    @Autowired
    private ISwearWordCategorieService service;


    @GetMapping(value = "/all")
    public ResponseEntity<List<SwearWordCategorieResponse>> getAllCategorie() {
        return ResponseEntity.ok(service.getAllCategories());
    }
}
