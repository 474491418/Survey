package edu.sust.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by envy15 on 2015/4/9 0009.
 */
public class MD5Example {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String src = "1993618";
        StringBuffer sb = new StringBuffer();
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        byte[] bytes = src.getBytes();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(bytes);
        //System.out.println(digest.length);
        for (byte b : digest) {
            sb.append(chars[(b >> 4) & 0x0F]);//先去移位取高四位的数字
            sb.append(chars[b & 0x0F]);//再去取低四位的数字
        }
        System.out.println(sb);

    }
}
