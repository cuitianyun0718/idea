package com.itdr.utils;

import com.itdr.utils.JDBCUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author:cty
 * @Date:2019/2/18 22:11
 * @Description:不负自己
 */

public class Test2 {
    @Test
    public void tt() throws IOException {
        Properties pe = new Properties();
        InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");

        pe.load(in);
        String driver = pe.getProperty("driver");
        System.out.println(driver);
    }
}
