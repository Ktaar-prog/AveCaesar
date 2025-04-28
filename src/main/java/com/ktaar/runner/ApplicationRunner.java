package com.ktaar.runner;

import com.ktaar.constants.CommandsSet;
import com.ktaar.encryption.BruteForceAction;
import com.ktaar.encryption.CaesarCipherAction;
import com.ktaar.encryption.DecryptAction;
import com.ktaar.encryption.EncryptAction;
import com.ktaar.exceptions.InvalidFileContentException;
import com.ktaar.exceptions.WrongFilePathException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

import static com.ktaar.constants.CommandsSet.*;
import static com.ktaar.constants.Constants.*;
import static com.ktaar.utils.CipherKeyValidatorUtil.isKeyValid;
import static com.ktaar.utils.CommandsValidatorUtil.isCommandValid;

public class ApplicationRunner {

    public void run(String[] args) {

        if (args == null) {
            System.out.println("The application is running with a command line interface -=>");
        }

        if (args != null && args.length < MAX_ALLOWED_ARGS_COUNT) {
            //throw exception
        }

        CommandsSet command = isCommandValid(args[COMMANDS_ARG_POSITION]);

        String filePath = args[FILE_PATH_ARG_POSITION];
        Path path = Path.of(filePath);
        isFileExist(path);
        String content = getFileContent(path);

        int key = isKeyValid(Integer.parseInt(args[KEY_ARG_POSITION]));
        Map<CommandsSet, CaesarCipherAction> operations = Map.of(ENCRYPT, new EncryptAction(key),
                DECRYPT, new DecryptAction(key),
                BRUTE_FORCE, new BruteForceAction());

        operations.get(command).execute(content);
    }

    private void isFileExist(Path path) {
        if (Files.notExists(path)) {
            throw new WrongFilePathException("Invalid path!");
        }
    }

    private String getFileContent(Path path) {
        try {
            return Files.lines(path).collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new InvalidFileContentException("Wrong file content!");
        }
    }
}
