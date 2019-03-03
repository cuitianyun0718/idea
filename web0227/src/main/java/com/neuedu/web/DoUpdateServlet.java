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

/**
 * @Author:cty
 * @Date:2019/3/2 21:49
 * @Description:不负自己
 */
@WebServlet("/doUpdate.do")
public class DoUpdateServlet extends HttpServlet {
    private IUserService service=new UserServiceImp();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String uname= req.getParameter("uname");
       String password= req.getParameter("password");
      int id= Integer.parseInt(req.getParameter("id"));

        User user=new User();
        user.setUname(uname);
        user.setPassword(password);
        user.setId(id);
        int a=service.update(user);
        resp.sendRedirect("list.do");
    }
}
