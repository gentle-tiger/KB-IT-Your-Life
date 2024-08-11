package org.example.controller.user;


import lombok.RequiredArgsConstructor;
import org.example.security.service.CustomUserServiceDetail;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@RequestMapping("/security")
public class SecurityController {
    private final String context = "/security";
    private final CustomUserServiceDetail customUserServiceDetail;

    @GetMapping("/login")
    public String login(){
        return context + "/login";
    }
    @GetMapping("/login-failed")
    public String loginFailPage(){
        return context + "/login-failed";
    }

    @GetMapping("/member")
    public String memberPage(Model model, Principal principal){
        if(principal == null){
            return "redirect:/security/login";  // principal이 null이면 로그인 페이지로 리다이렉트

        }
        UserDetails userdetails = customUserServiceDetail.loadUserByUsername(principal.getName());
        model.addAttribute("user", userdetails);
        return context + "/member";
    }

    // 확인만 하는 코드
    @GetMapping("/admin")
    public String adminPage(){
        return context + "/admin";
    }

}

