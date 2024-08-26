package org.example.service;


import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.example.repository.user.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public User findByUsername(String username) {
//        return userRepository.findByUsername(username);
        return userRepository.findByUsername(username);
    }

    public boolean isPasswordValid(User user, String rawPassword) {
        return passwordEncoder.matches(rawPassword, user.getPassword()); // matches 메서드는 인코더에서 제공하는 메서드임.

    }

    public User save(User user){
        String encodedPassword = passwordEncoder.encode(user.getPassword()); // 암호화를 시킬 대상 user.getPassword() 문자열을 인코디드패스워드로 변경
        user.setPassword(encodedPassword);
        user.setRoles("ROLE_MEMBER");
        return userRepository.save(user);
    }
}
