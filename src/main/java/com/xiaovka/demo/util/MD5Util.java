package com.xiaovka.demo.util;


import com.xiaovka.demo.pojo.ConsoleUser;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MD5Util {
    public static String ShiroMd5(ConsoleUser user) {
        String hashAlgorithmName = "MD5";//加密方式

        int hashIterations = 1024;//加密1024次

        Object crdentials = user.getPwd();//密码原值

        ByteSource salt = ByteSource.Util.bytes(user.getUserName());//以账号作为盐值

        return new SimpleHash(hashAlgorithmName, crdentials, salt, hashIterations).toHex();
    }

    public static void main(String[] args) {
        int hashIterations = 1024; // 加密次数
        String hashAlgorithmName = "MD5";// 加密方式
        SimpleHash hash = new SimpleHash(hashAlgorithmName, "123456", "test", hashIterations);
        System.err.println(hash.toHex());

    }

    public static String shiroMd5(String salt, String pwd) {
        String hashAlgorithmName = "MD5";//加密方式
        int hashIterations = 1024;//加密1024次
        return new SimpleHash(hashAlgorithmName, pwd, salt, hashIterations).toHex();
    }
}