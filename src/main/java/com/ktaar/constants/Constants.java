package com.ktaar.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Constants {

    public static List<String> ALLOWED_COMMANDS = List.of("ENCRYPT", "DECRYPT", "BRUT_FORCE");

    public static final int COMMANDS_ARG_POSITION = 0;
    public static final int FILE_PATH_ARG_POSITION = 1;
    public static final int KEY_ARG_POSITION = 2;
    public static final int MAX_ALLOWED_ARGS_COUNT = 2;

    public static final ArrayList<Character> CHARACTERS_EN = new ArrayList<>(
            Arrays.asList(
                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                    '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '
            )
    );
}
