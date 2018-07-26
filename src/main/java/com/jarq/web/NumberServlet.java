package com.jarq.web;

import com.jarq.beans.RandomNumber;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class NumberServlet extends HttpServlet {

    @EJB
    private RandomNumber randomNumber;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write("In NumberServlet. ");

        if (randomNumber == null) {
            out.write("Number Bean failed.");
        }

        out.write("Random bean is: " + randomNumber.getNumber());
        out.close();
    }
}
