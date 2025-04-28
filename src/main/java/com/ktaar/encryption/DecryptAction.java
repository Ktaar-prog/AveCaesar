package com.ktaar.encryption;

public class DecryptAction extends CaesarCipherAction {

    public final int key;
    private final CaesarCipher cipher = new CaesarCipher();

    public DecryptAction(int key) {
        this.key = key;
    }

    @Override
    public String execute(String text) {
        return cipher.shiftText(text, key);
    }
}

