package com.wardrobe.enums;

import java.util.Arrays;

/**
 * Represents the lifecycle events and actions that can perform on a clothing item.
 * Provides utility methods to safely parse string values into enum constants.
 */
public enum ActionType {
    /** The clothing item is to outfit. */
    OUTFIT,
    /** The clothing item is to sell. */
    SELL,
    /** The clothing item is to sell and to outfit. */
    BOTH,
    /** The clothing only created in wardrobe. */
    NONE;

    /**
     * Converts a string value into its corresponding {@link ActionType} enum constant.
     * The input is case-insensitive and trims trailing or leading whitespaces.
     *
     * @param value the string representation of the action type (e.g., "worn", "  CREATED  ")
     * @return the matching {@link ActionType} enum constant
     * @throws IllegalArgumentException if the provided value is null, empty, or does not match any action
     */
    public static ActionType fromValue(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Action type cannot be null or empty.");
        }

        String cleanedValue = value.trim().toUpperCase();

        return Arrays.stream(ActionType.values())
                .filter(action -> action.name().equals(cleanedValue))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid action type: " + value));
    }
}
