package com.wbg.web;

import com.wbg.entity.Users;
import com.wbg.service.Usersservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Usersweb")
public class Usersweb extends HttpServlet {
    static Usersservice usersservice=new Usersservice();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getParameter("action")){
            case "finAll":
                response.getWriter().print(usersservice.finAll());
                break;
            case "finById":
                response.getWriter().print(usersservice.finById(Integer.parseInt(request.getParameter("id"))));
                break;
            case "finByName":
                response.getWriter().print(usersservice.finByName(request.getParameter("name")));
                break;
            case "update":
                response.getWriter().print(usersservice.update(setUsers(request)));
                break;
        }
    }
    private static Users setUsers(HttpServletRequest request){
        return new Users(
                Integer.parseInt(request.getParameter("uid")),
                request.getParameter("uLoginName"),
                request.getParameter("uLoginPassword"),
                request.getParameter("uEmail"),
                request.getParameter("uName"),
                request.getParameter("usex"),
                request.getParameter("uTel"),
                request.getParameter("uAddress"),
                request.getParameter("ustatus")
        );
    }
}
