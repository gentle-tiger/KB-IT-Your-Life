package org.example.controller.user;


import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final String context = "/user";


    //   /user/login
    @GetMapping("/login")
    public String loginPage() {
        return context + "/login";
    }

    // POST /user/login
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {

        User user = userService.findByUsername(username);

        if (user == null) {
            model.addAttribute("errMsg", "해당 id의 사용자가 없습니다");
            return context + "/login-failed";
        }

        if (!userService.isPasswordValid(user, password)) {
            model.addAttribute("errMsg", "비밀번호가 틀립니다.");
            return context + "/login-failed";
        }
        // 왜 이렇게 처리 했냐? security를 보면 preHandle에서 loginUser이 null인지 아닌지 확인하기 때문에 동일하게 맞추는 것임.
        session.setAttribute("loginUser", user); // 객체를 전달.
        model.addAttribute("username", username); // 데이터만 전달.
        return context + "/login-success";
    }

    // GET /user/logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 차이 있음
//    session.removeAttribute("loginUser"); // 차이 있음.
        return context + "/logout";
    }

    // register
    @GetMapping("/register")
    public String registerPage(){
        return context + "/register";
    }


    @PostMapping("/register")
    public String register(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model
    ){
        // 예외 처리
        if(username.isEmpty() || password.isEmpty()){
            model.addAttribute("errMsg", "아이디 또는 비밀번호가 누락되었습니다.");
            return context + "/register-failed";
        }

        // db에 동일한 아이디가 있을 경우
        User user = userService.findByUsername(username);
        if(user != null){
            model.addAttribute("errMsg", "동일한 ID를 가지는 사용자가 존재한다.");
            return "register-failed";
        }

        // 비밀번호 암호화
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encodedPassword = passwordEncoder.encode(password);

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        userService.save(newUser); // db에 저장

        model.addAttribute("username", username);

        return context + "/register-success";
    }
}

