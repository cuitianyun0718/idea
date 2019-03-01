package com.itdr.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:cty
 * @Date:2019/2/26 16:48
 * @Description:不负自己
 */
//1 继承HttpServlet
//2 处理怎么样的请求(1,配置xml，加注释)
//    3,重写service
public class TestServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
//        System.out.println("init");
//        System.out.println(config.getServletName());
//        System.out.println(config.getInitParameter("a"));

    }
//    servlet生命周期
//    1,创建servlet对象

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getScheme());
//        System.out.println(req.getServerName());
//        System.out.println(req.getServerPort());
//        System.out.println(req.getContextPath());


//        System.out.println(1);
//        request  请求对象  从浏览器带过来的信息
//        response 相应对象 从服务器相应到浏览器
//        String str = "崔天云";
//        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter writer = resp.getWriter();
////        writer.print(str);
//        writer.print("<div style =' width:150px; height:200px; border:solid 1px #000'>崔天云</div>");
//        重定向 重新找到页面显示
//        重定以后地址栏地址会变化
//        相当于两次请求 会有两个对象
//        resp.sendRedirect("gg.jsp");
//        浏览器的请求
//        重定向可以重定到外网
//        重定向重定的是地址

//        转发，获取转发器
//        b把request和response 对象交给jsp
//        相当于一次请求
//        服务器的行为
//        转发只能在项目内
//        转发 转发的是文件
//        String s="Hello world";
//        req.setAttribute("key",s);
//        req.getRequestDispatcher("gg.jsp").forward(req,resp);
        resp.sendRedirect("http://www.baidu.com");
    }
}





















