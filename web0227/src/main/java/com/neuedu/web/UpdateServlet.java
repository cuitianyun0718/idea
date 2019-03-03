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
 * @Date:2019/3/2 10:33
 * @Description:不负自己
 */
@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet {
//    c查id对应的对象
    private IUserService service=new UserServiceImp();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     int id=  Integer.parseInt(req.getParameter("id")) ;
     User user=service.getUserById(id);
     if(user!=null){

         req.setAttribute("user",user);
         req.getRequestDispatcher("WEB-INF/update.jsp").forward(req,resp);

     }


    }
}
