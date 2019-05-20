package com.himalaya;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("name", "sunghee");
        req.getSession().setAttribute("userVo", new UserInfo("himalaya", 38));
        System.out.println("session id ::: " + req.getSession().getId());

        System.out.println("session name attribute ::: " + req.getSession().getAttribute("name"));
        System.out.println("session name attribute ::: " + ((UserInfo) req.getSession().getAttribute("userVo")).getUsername());
        System.out.println("session name attribute ::: " + ((UserInfo) req.getSession().getAttribute("userVo")).getAge());
    }
}
