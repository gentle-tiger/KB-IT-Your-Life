package org.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class UserConfig implements WebMvcConfigurer {
        @Bean
        public BCryptPasswordEncoder passwordEncoder() { // 암호화 메서드 호출
            return new BCryptPasswordEncoder();
        }

        // 모든 과정에 확인하는 메서드
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            System.out.println("시큐리티 인터셉터가 등록되었습니다");
            // 인터셉터 등록
            registry.addInterceptor(new AuthenticationInterceptor()) // 검사 조건
                    .addPathPatterns("/**") // 요청 실행 주소
                    .excludePathPatterns("/", "/user/**", "/resources/**"); // 해당 주소는 예외 처리
        }
}
