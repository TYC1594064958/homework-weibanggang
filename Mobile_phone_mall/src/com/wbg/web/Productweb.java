package com.wbg.web;

import com.wbg.entity.Product;
import com.wbg.service.Productservice;
import com.wbg.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/Productweb.do")
public class Productweb extends HttpServlet {
    static Productservice productservice=new Productservice();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print(productservice.add(setProduct(request)));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getParameter("action")){
            case "finAll":
                response.getWriter().print(productservice.finAll());
                break;
            case "finById":
                response.getWriter().print(productservice.finById(request.getParameter("pid")));
                break;
            case "finByName":
                response.getWriter().print(productservice.finByName(request.getParameter("pname")));
                break;
            case "update":
                response.getWriter().print(productservice.update(setProduct(request)));
                break;
            case "delete":
                response.getWriter().print(productservice.delete(request.getParameter("pid")));
                break;
        }
    }
    private static Product setProduct(HttpServletRequest request){
        return new Product(
                request.getParameter("pid"),
                request.getParameter("pname"),
                Double.parseDouble(request.getParameter("pprice")),
                Integer.parseInt(request.getParameter("pnumber")),
                request.getParameter("pimg"),
                DBUtil.date(request.getParameter("ptime")),
                Integer.parseInt(request.getParameter("ptid")),
                request.getParameter("pstatus")
        );
    }
}
