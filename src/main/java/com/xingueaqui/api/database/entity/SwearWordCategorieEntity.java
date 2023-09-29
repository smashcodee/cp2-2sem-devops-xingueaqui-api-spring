package com.xingueaqui.api.database.entity;

import com.xingueaqui.api.enums.SwearWordCategorieEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "sc_swear_word_categorie")
@Data
public class SwearWordCategorieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categorie_id")
    private UUID categorieId;

    @Enumerated(EnumType.STRING)
    private SwearWordCategorieEnum categorie;


    public SwearWordCategorieEntity() { }
}
