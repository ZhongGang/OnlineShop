package com.icode.share;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-19
 * Time: 下午2:59
 */
public class GuidGenerator {

    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
