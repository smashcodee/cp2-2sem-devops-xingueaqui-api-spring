package com.xingueaqui.api.database.repository;

import com.xingueaqui.api.database.entity.SwearWordCategorieEntity;
import com.xingueaqui.api.enums.SwearWordCategorieEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface ISwearWordCategorieRepository extends JpaRepository<SwearWordCategorieEntity, UUID> {
    @Query("SELECT s FROM SwearWordCategorieEntity s WHERE s.categorie = :categorie")
    Optional<SwearWordCategorieEntity> existsByCategorie(@Param(value = "categorie") SwearWordCategorieEnum categorie);
}
