package com.wardrobe.enums;

import java.util.Arrays;

/**
 * Represents the standard sizes for clothing items.
 * Provides utility methods to safely parse string values into enum constants.
 */
public enum ClothingSize {
    /** Extra Small size. */
    XS,
    /** Small size. */
    S,
    /** Medium size. */
    M,
    /** Large size. */
    L,
    /** Extra Large size. */
    XL,
    /** Double Extra Large size. */
    XXL,
    /** One size fits all / Unique size. */
    UNIQUE;

    /**
     * Converts a string value into its corresponding {@link ClothingSize} enum constant.
     * The input is case-insensitive and trims trailing or leading whitespaces.
     *
     * @param value the string representation of the size (e.g., "xl", "  m  ", "Unique")
     * @return the matching {@link ClothingSize} enum constant
     * @throws IllegalArgumentException if the provided value is null, empty, or does not match any size
     */
    public static ClothingSize fromValue(final String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Clothing size cannot be null or empty.");
        }

        String cleanedValue = value.trim().toUpperCase();

        return Arrays.stream(ClothingSize.values())
                .filter(size -> size.name().equals(cleanedValue))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid clothing size: " + value));
    }
}
