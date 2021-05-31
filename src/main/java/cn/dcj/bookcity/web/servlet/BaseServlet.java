package cn.dcj.bookcity.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //这是一个总的httpservlet方法，主要完成一个方法的分发
        //1.获取请求路径/user/add
        String uri = req.getRequestURI();
        System.out.println(uri);
        //2.获取方法名称
        String name = uri.substring(uri.lastIndexOf('/')+1);
        System.out.println(name);
        //3.获取方法对象method

        //4.执行方法

    }
}
