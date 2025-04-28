package com.ktaar.constants;

public enum CommandsSet {
    ENCRYPT,
    DECRYPT,
    BRUTE_FORCE;

    public static CommandsSet fromString(String value) {
        return CommandsSet.valueOf(value.toUpperCase());
    }
}
