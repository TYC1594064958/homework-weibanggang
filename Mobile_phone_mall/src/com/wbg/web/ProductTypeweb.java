package com.wbg.web;

import com.wbg.dao.ProductTypeDao;
import com.wbg.entity.ProductType;
import com.wbg.service.ProductTypeservice;
import com.wbg.service.Productservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProductTypeweb.do")
public class ProductTypeweb extends HttpServlet {
    ProductTypeservice productTypeservice=new ProductTypeservice();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print(productTypeservice.add(setProductType(request,0)));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getParameter("action")){
            case "finAll":
                response.getWriter().print(productTypeservice.finAll());
                break;
            case "finById":
                response.getWriter().print(productTypeservice.finById(Integer.parseInt(request.getParameter("id"))));
                break;
            case "finByName":
                response.getWriter().print(productTypeservice.finByName(request.getParameter("tname")));
                break;
            case "update":
                response.getWriter().print(productTypeservice.update(setProductType(request,1)));
                break;
            case "delete":
                response.getWriter().print(productTypeservice.delete(Integer.parseInt(request.getParameter("id"))));
                break;
        }
    }
    private static ProductType setProductType(HttpServletRequest request,int id){
        if(id==0){
            return new ProductType(
                    request.getParameter("tname"),
                    request.getParameter("timg")
            );
        }
        return new ProductType(
        Integer.parseInt(request.getParameter("tid")),
        request.getParameter("tname"),
        request.getParameter("timg")
        );
    }
}
