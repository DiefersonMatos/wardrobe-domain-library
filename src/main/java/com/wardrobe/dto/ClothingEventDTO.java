package com.wardrobe.dto;

import com.wardrobe.enums.ClothingSize;
import com.wardrobe.enums.ClothingType;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Data Transfer Object representing a specific lifecycle event for a piece of clothing.
 * This record is immutable and thread-safe by design.
 */
public record ClothingEventDTO(
        UUID id,
        String name,
        ClothingType clothingType,
        String color,
        ClothingSize size,
        com.suabiblioteca.dto.Brand brand,
        com.suabiblioteca.dto.Brand collabBrand,
        boolean isCollab,
        String actionType,
        BigDecimal price,
        long lastUpdateTime
) {}