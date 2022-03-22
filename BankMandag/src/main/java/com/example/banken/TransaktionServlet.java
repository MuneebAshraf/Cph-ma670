package com.example.banken;

import DomæneObjekter.Konto;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TransaktionServlet", value = "/transaktion-servlet")
public class TransaktionServlet extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        int amount = 0;
        HttpSession session = request.getSession();

        String beløb = request.getParameter("beløb");
        log("beløbet er "  + beløb);

        try
        {
            amount = Integer.parseInt(beløb);
        } catch (NumberFormatException e)
        {
            String fejl = "Beløbet skal være et tal";
            request.setAttribute("fejl", fejl);
            request.getRequestDispatcher("WEB-INF/Brugerside.jsp").forward(request,response);
        }

        Konto konto = (Konto) session.getAttribute("konto");
        konto.indsæt(amount);
        session.setAttribute("konto", konto);
        request.getRequestDispatcher("WEB-INF/Brugerside.jsp").forward(request,response);
    }
}
