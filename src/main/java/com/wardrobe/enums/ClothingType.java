package com.wardrobe.enums;

import java.util.Arrays;

/**
 * Represents the categorization of clothing items supported by the library.
 * Provides utility methods to safely parse string values into enum constants.
 */
public enum ClothingType {
    /** Shirts with buttons or collars. */
    SHIRT,
    /** Casual t-shirts. */
    TSHIRT,
    /** Trousers, jeans, or shorts. */
    PANTS,
    /** Coats, blazers, or outerwear. */
    JACKET,
    /** One-piece dresses. */
    DRESS,
    /** Skirts. */
    SKIRT,
    /** Hats. */
    HAT,
    /** Sweaters, hoodies, or cardigans. */
    SWEATER;

    /**
     * Converts a string value into its corresponding {@link ClothingType} enum constant.
     * The input is case-insensitive and trims trailing or leading whitespaces.
     *
     * @param value the string representation of the clothing type (e.g., "jacket", "  PANTS  ")
     * @return the matching {@link ClothingType} enum constant
     * @throws IllegalArgumentException if the provided value is null, empty, or does not match any type
     */
    public static ClothingType fromValue(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Clothing type cannot be null or empty.");
        }

        String cleanedValue = value.trim().toUpperCase();

        return Arrays.stream(ClothingType.values())
                .filter(type -> type.name().equals(cleanedValue))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid clothing type: " + value));
    }
}
