package com.ktaar.utils;

import com.ktaar.exceptions.InvalidKeyException;

public class CipherKeyValidatorUtil {

    public static Integer isKeyValid(String cipherKey) {

        try {
            int key = Integer.parseInt(cipherKey);
            if (Integer.parseInt(cipherKey) != 0) {
                return key;
            } else {
                throw new InvalidKeyException("Key cannot be 0!");
            }
        } catch (RuntimeException e) {
            throw new InvalidKeyException("Invalid key format!");
        }
    }
}
