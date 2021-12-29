package com.tuya.lighting.open.api.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * Sign Utils
 *
 * @author lighting
 */
public class SignUtils {

    public static String sign(String message, String secret) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            instance.init(secretKeySpec);
            byte[] bytes = instance.doFinal(message.getBytes());
            return new HexBinaryAdapter().marshal(bytes).toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException("Sign failed. " + e.getMessage());
        }
    }

    public static String encryption(String str) throws Exception {
        return encryption(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String encryption(byte[] buf) throws Exception {
        MessageDigest messageDigest;
        messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(buf);
        return byte2Hex(messageDigest.digest());
    }

    private static String byte2Hex(byte[] bytes) {
        StringBuilder stringBuffer = new StringBuilder();
        String temp;
        for (byte aByte : bytes) {
            temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}
