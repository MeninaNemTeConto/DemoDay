package com.example.demo.model.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Util {

    public static String md5(String senha) throws Exception {

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        BigInteger hash = new BigInteger(1, messageDigest.digest(senha.getBytes()));

        return hash.toString(16);
    }



}
