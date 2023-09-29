package com.xingueaqui.api.controller;

import com.xingueaqui.api.response.SwearWordCategorieResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ISwearWordCategorieController {
    ResponseEntity<List<SwearWordCategorieResponse>> getAllCategorie();
}
