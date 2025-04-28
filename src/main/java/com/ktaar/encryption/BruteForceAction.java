package com.ktaar.encryption;

public class BruteForceAction extends CaesarCipherAction {

    private final CaesarCipher cipher = new CaesarCipher();

    @Override
    public String execute(String text) {
        cipher.shiftText(text, 1);  // serching key
        return super.execute(text);
    }

    //privat metod for searching key
}
