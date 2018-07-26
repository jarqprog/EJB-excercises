package com.jarq.web;

import com.jarq.beans.MyLocal;
import com.jarq.beans.StatelessHello;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class HelloServlet extends HttpServlet {

    @EJB
    private StatelessHello hello;

//    it would cause an exception!
//    @EJB
//    private MyLocalBean localBean;

    @EJB
    private MyLocal localBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("In hello servlet");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write("In Hello servlet. ");

        if (hello == null) {
            out.write("Hello bean is not available!");
            return;
        }

        if (localBean != null) {
            out.write(" Local bean says: ) " + localBean.expressYourself());
        }

        out.write("Bean says: " + hello.getHello());
        out.close();
    }
}
