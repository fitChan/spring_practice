package com.example.spring_practice;

import com.example.spring_practice.rsa.KeyGenTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;

@SpringBootApplication
public class SpringPracticeApplication {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, NoSuchProviderException, InvalidKeyException {
        SpringApplication.run(SpringPracticeApplication.class, args);

        KeyGenTest keyGen = new KeyGenTest();
        byte[] enc_text = keyGen.enc(keyGen.getPublicKey(), "plainText");
        byte[] dec_text = keyGen.dec(keyGen.getPrivateKey(), enc_text);
        System.out.println((Arrays.toString(enc_text)));
        System.out.println(new String(dec_text));
    }

}
