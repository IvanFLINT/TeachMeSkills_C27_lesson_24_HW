package com.teachmeskills.lesson24.task2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/checkAge")
public class AgeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ageParam = req.getParameter("age");
        if(ageParam != null && !ageParam.isEmpty()){
            int age = Integer.parseInt(ageParam);
            boolean isAdult = age >=18;
            String result = isAdult ? "A mature adult" : "Not an adult";
            resp.setContentType("text/html");
        }else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("Age not specified");
        }
    }
}
