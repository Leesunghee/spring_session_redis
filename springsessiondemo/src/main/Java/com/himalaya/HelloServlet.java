package com.himalaya;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class HelloServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(60 * 360);
        session.setAttribute("name", "sunghee");
        session.setAttribute("userVo", new UserInfo("himalaya", 38));
        System.out.println("session id ::: " + session.getId());

        System.out.println("session name attribute ::: " + session.getAttribute("name"));
        System.out.println("session name attribute ::: " + ((UserInfo) session.getAttribute("userVo")).getUsername());
        System.out.println("session name attribute ::: " + ((UserInfo) session.getAttribute("userVo")).getAge());
    }
}