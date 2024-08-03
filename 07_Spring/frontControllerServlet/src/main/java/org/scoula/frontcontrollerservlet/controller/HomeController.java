package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        // request는 Scope 종류 중 1개이다.
        request.setAttribute("QR","https://item.kakaocdn.net/do/3470ae440509f8929617f1c0b08dd0bd7154249a3890514a43687a85e6b6cc82" );

        return "index";
    }
}
