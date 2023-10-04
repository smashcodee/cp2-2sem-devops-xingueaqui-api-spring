package com.xingueaqui.api.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "sc_swear_words")
@Data
public class SwearWordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_id", updatable = false, insertable = false)
    private UUID wordId;

    @Lob
    private String content;

    @Column(name = "categorie_id")
    private UUID categorieId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public SwearWordEntity() { }
}
