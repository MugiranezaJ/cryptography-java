package org.example;

public class CaesarCipher {
    private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ!";

    public String encrypt(String plainText, int key){
        plainText = plainText.toUpperCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            int index = ALPHABET.indexOf(ch);
            index = Math.floorMod(index + key, ALPHABET.length());
            cipherText += ALPHABET.charAt(index);
        }
        return cipherText;
    }

    public String decrypt(String cipherText, int key){
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            int index = ALPHABET.indexOf(ch);
            index = Math.floorMod(index - key, ALPHABET.length());
            plainText += ALPHABET.charAt(index);
        }
        return plainText;
    }
}
