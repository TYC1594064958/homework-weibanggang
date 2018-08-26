package com.wbg.web;

import com.wbg.dao.AdminsDao;
import com.wbg.entity.Admins;
import com.wbg.service.Adminsservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Adminsweb.do")
public class Adminsweb extends HttpServlet {
    static Adminsservice adminsservice=new Adminsservice();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getParameter("action")){
            case "update":
                System.out.println(Integer.parseInt(request.getParameter("aid")));
                System.out.println(request.getParameter("aname"));
                System.out.println(request.getParameter("atype"));
                System.out.println(request.getParameter("astatus"));
                response.getWriter().print(adminsservice.update(setAdmin(request,1)));
                break;
            case "add":
                response.getWriter().print(adminsservice.add(setAdmin(request,0)));
                break;
            case "updatepwd":
                response.getWriter().print(adminsservice.updatepwd(setAdmin(request,1)));
                break;
            case "login":
                response.getWriter().print(adminsservice.login(request.getParameter("aname"), request.getParameter("apwd")));
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getParameter("action")){
            case "finAll":
                response.getWriter().print(adminsservice.finAll());
                break;
            case "finById":
                response.getWriter().print(adminsservice.finById(Integer.parseInt(request.getParameter("id"))));
                break;
            case "finByName":
                response.getWriter().print(adminsservice.finByName(request.getParameter("name")));
                break;
            case "delete":
                response.getWriter().print(adminsservice.delete(Integer.parseInt(request.getParameter("id"))));
                break;
        }
    }
    private static  Admins setAdmin(HttpServletRequest request,int id){
            if(id==0){
                return new Admins(
                        request.getParameter("aname"),
                        request.getParameter("apwd"),
                        request.getParameter("atype"),
                        request.getParameter("astatus")
                );
            }
        return new Admins(
                Integer.parseInt(request.getParameter("aid")),
                request.getParameter("aname"),
                request.getParameter("apwd"),
                request.getParameter("atype"),
                request.getParameter("astatus")
        );
    }
}
