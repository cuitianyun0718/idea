package com.neuedu.web;

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
 * @Date:2019/3/2 10:12
 * @Description:不负自己
 */
@WebServlet("/delete.do")
public class DeleteServlet extends HttpServlet {
    private IUserService service=new UserServiceImp();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
       service.delete(id);
       resp.sendRedirect("list.do");
    }
}
