package edu.sust.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;

/**
 * Created by envy15 on 2015/4/9 0009.
 */
public class DataUtil {
    /**
     * 使用md5算法进行加密
     *
     * @param password
     * @return
     */
    public static String md5(String password) {
        StringBuffer target = new StringBuffer();
        try {

            char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            byte[] bytes = password.getBytes();

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(bytes);
            for (byte b : digest) {
                target.append(chars[(b >> 4) & 0x0F]);//先去移位取高四位的数字
                target.append(chars[b & 0x0F]);//再去取低四位的数字
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        return target.toString();
    }

    /**
     * 集合内数据的有效性判断
     */
    public static boolean isListHasData(Collection col) {
        if (col == null || col.isEmpty()) return true;
        return false;
    }
}
