package com.wbg.web;

import com.wbg.dao.OrderInformationDao;
import com.wbg.entity.OrderInformation;
import com.wbg.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
@WebServlet("/OrderInformationweb.do")
public class OrderInformationweb extends HttpServlet {
    static OrderInformationDao orderInformationDao=new OrderInformationDao();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        switch (request.getParameter("action")){
            case "finAll":
                response.getWriter().print(orderInformationDao.finAll());
                break;
            case "finById":
                response.getWriter().print(orderInformationDao.finById(Integer.parseInt(request.getParameter("tid"))));
                break;
            case "finByName":
                response.getWriter().print(orderInformationDao.finByName(request.getParameter("tname")));
                break;
            case "update":
                response.getWriter().print(orderInformationDao.update(setOrderInformation(request)));
                break;
        }
    }
    private static OrderInformation setOrderInformation(HttpServletRequest request){
        return new OrderInformation(
                request.getParameter("oid"),
                DBUtil.date(request.getParameter("otime")),
                DBUtil.date(request.getParameter("osuretime")),
                Integer.parseInt(request.getParameter("ouid")),
                request.getParameter("kd"),
                request.getParameter("address"),
                Double.parseDouble(request.getParameter("omoney")),
                request.getParameter("ostatus"),
                request.getParameter("otype")
        );
    }

}
