package org.example.security.service;

import javassist.Loader;
import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.example.repository.user.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class CustomUserServiceDetail implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username); //우리가 선언한 entity 도메인
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        //spring security에서 제공하는 거.
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        String[] roles = user.getRoles().split(",");
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        //. 중요한 코드
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                authorities); // spring seurity


    }
}
