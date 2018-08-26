package com.wbg.web;

import com.wbg.dao.OrderdetailsDao;
import com.wbg.entity.Orderdetails;
import com.wbg.service.Orderdetailsservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Orderdetailsweb.do")
public class Orderdetailsweb extends HttpServlet {
    Orderdetailsservice orderdetailsservice=new Orderdetailsservice();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getParameter("action")){
            case "finAll":
                response.getWriter().print(orderdetailsservice.finAll());
                break;
            case "finById":
                response.getWriter().print(orderdetailsservice.finById(Integer.parseInt(request.getParameter("tid"))));
                break;
            case "finByName":
                response.getWriter().print(orderdetailsservice.finByName(request.getParameter("tname")));
                break;
            case "update":
                response.getWriter().print(orderdetailsservice.update(setOrderdetails(request)));
                break;
        }
    }
    private static Orderdetails setOrderdetails(HttpServletRequest request){
        return new Orderdetails(
                Integer.parseInt(request.getParameter("dtid")),
                request.getParameter("dtpid"),
                Integer.parseInt(request.getParameter("dtnumber")),
                request.getParameter("dtoid")
        );
    }
}
