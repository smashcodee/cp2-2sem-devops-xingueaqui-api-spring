package com.xingueaqui.api.service.impl;

import com.xingueaqui.api.database.entity.SwearWordCategorieEntity;
import com.xingueaqui.api.database.entity.SwearWordEntity;
import com.xingueaqui.api.database.repository.ISwearWordCategorieRepository;
import com.xingueaqui.api.database.repository.ISwearWordRepository;
import com.xingueaqui.api.enums.SwearWordCategorieEnum;
import com.xingueaqui.api.request.SwearWordRequest;
import com.xingueaqui.api.response.OkStatusResponse;
import com.xingueaqui.api.service.ISwearWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class SwearWordServiceImpl implements ISwearWordService {
    @Autowired
    private ISwearWordRepository repository;
    @Autowired
    private ISwearWordCategorieRepository categorieRepository;
    @Override
    public OkStatusResponse create(SwearWordRequest request) {
        SwearWordCategorieEntity categorieEntity;
        Optional<SwearWordCategorieEntity> optional = getSwearWordCategorieByCategorie(request.categorie());
        if(optional.isPresent()) {
            categorieEntity = optional.get();
        } else {
            categorieEntity = new SwearWordCategorieEntity();
            categorieEntity.setCategorie(request.categorie());
        }

        SwearWordCategorieEntity categoriePersisted = categorieRepository.saveAndFlush(categorieEntity);

        SwearWordEntity entity = new SwearWordEntity();
        entity.setContent(request.swearWord());
        entity.setCreatedAt(LocalDateTime.now());
        entity.setCategorieId(categoriePersisted.getCategorieId());

        SwearWordEntity persisted = repository.saveAndFlush(entity);

        return new OkStatusResponse(201, "phrase registered successfully.");
    }

    private Optional<SwearWordCategorieEntity> getSwearWordCategorieByCategorie(SwearWordCategorieEnum categorie) {
        Optional<SwearWordCategorieEntity> optional = categorieRepository.existsByCategorie(categorie);
        return optional;
    }
}
