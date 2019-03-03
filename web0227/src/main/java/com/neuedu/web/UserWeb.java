package com.neuedu.web;

import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author:cty
 * @Date:2019/3/1 16:36
 * @Description:不负自己
 */
@WebServlet("/list.do")
public class UserWeb extends HttpServlet {
    private IUserService service=new UserServiceImp();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       List<User> lists= service.getUsers();
      req.setAttribute("lists",lists);
      req.getRequestDispatcher("WEB-INF/list.jsp").forward(req,resp);
        }
    }

