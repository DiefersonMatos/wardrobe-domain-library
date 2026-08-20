package com.suabiblioteca.dto;

import java.util.Arrays;

/**
 * Represents the supported clothing brands within the library ecosystem.
 * Provides utility methods to safely parse string values into enum constants.
 */
public enum Brand {
    /** Nike sportswear brand. */
    NIKE,
    /** Adidas sportswear brand. */
    ADIDAS,
    /** Puma sportswear brand. */
    PUMA,
    /** Asics sportswear brand. */
    ASICS,
    /** Vans skate streetwear fashion brand. */
    VANS,
    /** Supreme streetwear fashion brand. */
    SUPREME,
    /** BAPE streetwear fashion brand. */
    BAPE,
    /** Palace skate streetwear fashion brand. */
    PALACE,
    /** Levi's denim and casual brand. */
    LEVIS,
    /** Fear of god streetwear fashion brand. */
    FEAR_OF_GOD,
    /** Song for the mute streetwear fashion brand. */
    SONG_FOR_THE_MUTE,
    /** Fallback constant for any brand not explicitly listed. */
    UNKNOWN;

    /**
     * Converts a string value into its corresponding {@link Brand} enum constant.
     * The input is case-insensitive and trims trailing or leading whitespaces.
     * If the brand is unrecognized, it safely falls back to {@link Brand#UNKNOWN}.
     *
     * @param value the string representation of the brand (e.g., "Nike", "  zara  ")
     * @return the matching {@link Brand} enum constant, or {@link Brand#UNKNOWN} if not found
     * @throws IllegalArgumentException if the provided value is null or empty
     */
    public static Brand fromValue(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }

        String cleanedValue = value.trim().toUpperCase();

        // Custom approach for Brands: fallback to UNKNOWN instead of crashing the application
        return Arrays.stream(Brand.values())
                .filter(brand -> brand.name().equals(cleanedValue))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
