package com.xingueaqui.api.database.repository;

import com.xingueaqui.api.database.entity.SwearWordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ISwearWordRepository extends JpaRepository<SwearWordEntity, UUID> {
}
