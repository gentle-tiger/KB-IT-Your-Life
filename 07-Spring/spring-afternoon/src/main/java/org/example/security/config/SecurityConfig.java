package org.example.security.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.example.security.service.CustomUserServiceDetail;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;


@Configuration
@EnableWebSecurity //  Spring Security를 활성화하는 애너테이션
@RequiredArgsConstructor // lombok 라이브러리의 애너테이션. 모든 final 필드를 초기화하는 생성자를 자동으로 생성
@Log4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final CustomUserServiceDetail customUserServiceDetail; // 사용자 인증을 처리하기 위해 사용되는 서비스. 사용자 정보를 로드.
    private final BCryptPasswordEncoder bCryptPasswordEncoder; // 비밀번호를 암호화하는 데 사용되는 객체. 비밀번호 저장 및 비교에 사용.


    public CharacterEncodingFilter encodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        return encodingFilter;
    }

    // 그 외의 주소는 ROLE_MEMBER를 가지고 있어야 들어갈 수 있다?
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/user/**").permitAll()
                .antMatchers("/security/admin").access("hasRole('ROLE_ADMIN')") // 순서 중요.
                .antMatchers("/security/**").permitAll()
                .antMatchers("/**").access("hasRole('ROLE_MEMBER')");

        // 로그인이 안 되어 있는 상태에서 로그인
        http.formLogin()
                .loginPage("/security/login") // 로그인 페이지의 경로
                .loginProcessingUrl("/security/login")
                .defaultSuccessUrl("/security/member") // 성공시 member로 리다이렉트
                .failureUrl("/security/login-failed"); // 실패시 member로 리다이렉트


        http.addFilterBefore(encodingFilter(), CsrfFilter.class);

        //로그아웃
        http.logout()
                .logoutUrl("/security/logout")
                .invalidateHttpSession(true)
                .deleteCookies("remember-me", "JSESSIONID") // 쿠키 삭제
                .logoutSuccessUrl("/security/login")
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserServiceDetail)
                .passwordEncoder(bCryptPasswordEncoder);
    }
}
