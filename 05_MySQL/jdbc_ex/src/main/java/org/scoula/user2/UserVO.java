package org.scoula.user2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
public class UserVO {

    // final 은 직접 값을 할당하거나 최소 생성자 생성시 값 할당해야한다.
    private final int id;
    private final String userid;
    private final String name;
    private final String password;
    private final int age;
    private final boolean membership;
    private final Timestamp signupDate;




}
