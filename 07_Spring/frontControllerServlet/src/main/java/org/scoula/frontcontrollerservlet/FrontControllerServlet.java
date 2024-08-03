package org.scoula.frontcontrollerservlet;

import org.scoula.frontcontrollerservlet.controller.AboutController;
import org.scoula.frontcontrollerservlet.controller.Controller;
import org.scoula.frontcontrollerservlet.controller.HomeController;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

// 어떤 역할을 하는지.
@WebServlet(name = "FrontControllerServlet", value = "/")
public class FrontControllerServlet extends HttpServlet {


    private Map<String, Controller> controllers = new HashMap<>();

    @Override
    public void init() throws ServletException {
        // 주소값과 컨트롤러 매핑
        controllers.put("/", new HomeController()); //servlet과 jps만 만들고 등록하면 연결되는 것.
        controllers.put("/about", new AboutController());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }


    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String requestURI = request.getRequestURI();
        System.out.println("requestURI : " + requestURI);
        String contextPath = request.getContextPath();
        System.out.println("contextPath : " + contextPath);
        String path = requestURI.substring(contextPath.length());
        System.out.println("path = " + path);

        //   requestURI : /Gradle___org_scoula___frontControllerServlet_1_0_SNAPSHOT_war/
        //   contextPath : /Gradle___org_scoula___frontControllerServlet_1_0_SNAPSHOT_war
        //   path = /

        Controller controller = controllers.get(path);
        if (controller != null) {
            String viewName = controller.getView(request, response);
            String targetView = "/WEB-INF/views/" + viewName + ".jsp";
            request.getRequestDispatcher(targetView).forward(request, response);

        }else{
            String notFoundView = "/WEB-INF/views/404.jsp";
            request.getRequestDispatcher(notFoundView).forward(request, response);
        }
    }

}


