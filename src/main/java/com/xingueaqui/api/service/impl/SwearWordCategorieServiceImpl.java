package com.xingueaqui.api.service.impl;

import com.xingueaqui.api.enums.SwearWordCategorieEnum;
import com.xingueaqui.api.response.SwearWordCategorieResponse;
import com.xingueaqui.api.service.ISwearWordCategorieService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SwearWordCategorieServiceImpl implements ISwearWordCategorieService {
    @Override
    public List<SwearWordCategorieResponse> getAllCategories() {
        List<SwearWordCategorieResponse> response = new ArrayList<>();
        for(SwearWordCategorieEnum categorie : SwearWordCategorieEnum.values()) {
            response.add(new SwearWordCategorieResponse(categorie.toString()));
        }
        return response;
    }
}
