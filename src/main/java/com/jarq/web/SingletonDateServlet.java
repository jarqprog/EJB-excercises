package com.jarq.web;

import com.jarq.beans.SingletonDate;
import com.jarq.beans.SingletonDateBean;
import com.jarq.beans.StatelessHello;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonDateServlet extends HttpServlet {

    @EJB
    private SingletonDate dateBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("In singleton date servlet");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write("In singleton date servlet. ");

        if (dateBean == null) {
            out.write("Date bean is not available!");
            return;
        }

        out.write("Bean says, that we have: " + dateBean.getDate());
        out.close();
    }

}
