package org.example;

public class Main {
    public static void main(String[] args) {
        String m = "welcome to my UDEMY course!";
        String encrypted = "ZHOFRPHCWRCP CXGHP CFRXUVHB";
        int key = 3;
        CaesarCipher caesarCipher = new CaesarCipher();
        CrackCaesarCipher crackCaesarCipher = new CrackCaesarCipher();

        String cipher = caesarCipher.encrypt(m, key);

        String plainText = caesarCipher.decrypt(cipher, key);
        System.out.println("------------------encrypted-----------------------");
        System.out.println(cipher);
        System.out.println("------------------decrypted-----------------------");
        System.out.println(plainText);

        // crack
        crackCaesarCipher.crackCaesar(encrypted);
    }
}