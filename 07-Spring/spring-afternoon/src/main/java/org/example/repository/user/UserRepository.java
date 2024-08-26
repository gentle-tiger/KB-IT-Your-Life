package org.example.repository.user;


import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em; // 주입
// 확인하고
    public User findByUsername(String username) {
        String jpql = "SELECT u FROM User u WHERE u.username = :username"; // 독특한 구조를 가진다.

        List<User> users = em.createQuery(jpql, User.class)
                .setParameter("username", username)
                .getResultList();
        return users.isEmpty() ? null : users.get(0); // 리스트가 비면 null, 비어있지 않으며 첫 번째 값 반환.
    }
// 가입시킴
    public User save(User user) {
        em.persist(user); // db 가 알아서 값을 받아와서 저장한다.
        return user;
    }






}
