package com.ktaar.encryption;

import static com.ktaar.constants.Constants.CHARACTERS_EN;

public class CaesarCipher {

    public String shiftText(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (CHARACTERS_EN.contains(c)) {
                char cTemp = CHARACTERS_EN.get(CHARACTERS_EN.indexOf(c) + shift);
                result.append(cTemp);
            }
            result.append(c);
        }

        return result.toString();
    }
}
