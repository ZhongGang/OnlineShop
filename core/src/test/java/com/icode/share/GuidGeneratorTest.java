package com.icode.share;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-19
 * Time: 下午3:00
 */
public class GuidGeneratorTest {

    @Test
    public void testGenerate() throws Exception {
        System.out.println(GuidGenerator.generate());
    }
}
