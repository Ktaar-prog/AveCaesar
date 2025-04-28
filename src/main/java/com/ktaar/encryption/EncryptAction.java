package com.ktaar.encryption;

public class EncryptAction extends CaesarCipherAction {

    private final int key;
    private final CaesarCipher cipher = new CaesarCipher();

    public EncryptAction(int key) {
        this.key = key;
    }
    @Override
    public String execute(String text) {
        return cipher.shiftText(text, key);
    }
}
