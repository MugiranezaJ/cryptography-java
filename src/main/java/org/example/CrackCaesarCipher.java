package org.example;

public class CrackCaesarCipher {
    private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ!";
    public void crackCaesar(String cipherText){
        for (int key = 0; key < ALPHABET.length() - 1; key++) {
            String plainText = "";
            for (int ch = 0; ch < cipherText.length() - 1; ch++) {
                int index = ALPHABET.indexOf(cipherText.charAt(ch));
                index = Math.floorMod(index - key, ALPHABET.length());
                plainText += ALPHABET.charAt(index);
            }
            System.out.format("For key %s, the result is %s", key, plainText);
            System.out.println();
        }
    }
}
