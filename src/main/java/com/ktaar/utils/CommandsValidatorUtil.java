package com.ktaar.utils;

import com.ktaar.constants.CommandsSet;
import com.ktaar.exceptions.InvalidCommandException;

import static com.ktaar.constants.Constants.ALLOWED_COMMANDS;

public class CommandsValidatorUtil {

    public static CommandsSet isCommandValid(String commandStr) {
        if (!ALLOWED_COMMANDS.contains(commandStr.toUpperCase())) {
            throw new InvalidCommandException("Invalid command! Allowed commands is: ENCRYPT, DECRYPT, BRUT_FORCE.");
        } else {
            return CommandsSet.fromString(commandStr);
        }
    }
}
