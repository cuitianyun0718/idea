package com.itdr.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:cty
 * @Date:2019/2/26 19:28
 * @Description:不负自己
 */
public class Test2 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
//        System.out.println("test 的init");

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("这是test2");
    }
}
