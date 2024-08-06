package org.example.ex3;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.awt.print.Printable;
import java.util.ArrayList;

public class CartSaveServelt extends HttpServlet {
    protected void doGet(){
        response.setContentType("text/html; charset=UTF-8");
        PrintWrite out = response.getWriter();
        String product = request.getParameter("product");

        HttpSession session = request.getSession();
        ArrayList<String> list = (ArrayList<String>) session.getAttribute("product");
    }

    if(list == null){
        list = new ArrayList<Stirng>();
        session.setAttribute("product", list);

    }

    list.add(product);

    put.


}
