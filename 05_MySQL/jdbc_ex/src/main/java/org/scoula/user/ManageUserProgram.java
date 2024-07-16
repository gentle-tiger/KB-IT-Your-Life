package org.scoula.user;

import org.scoula.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ManageUserProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 회원 정보 입력 받기
        System.out.print("추가할 회원의 ID : ");
        String id = scanner.nextLine();
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("비밀번호 : ");
        String password = scanner.nextLine();
        System.out.print("나이 : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("멤버쉽 여부 (true/false) : ");
        boolean membership = scanner.nextBoolean();
        scanner.nextLine();

        // 회원 정보
        User newUser = new User(id, name, password, age, membership);

        // 데이터베이스 접속
        Connection conn = JDBCUtil.getConnection();

        // DB 통신을 전담하는 인스턴스의 메서드를 사용하여 OOP적 구현
//        ManageUser manageUser = new ManageUser();
        // DB 통신 및 회원 추가 클래스를 인스턴스화. 호원 추가 메서드에 생성한 회원의 객체를 전달.
//        manageUser.addUser(newUser);


//        // 삭제할 회원의 id 입력 받기
//        System.out.println("삭제할 회원의 ID : ");
//        int deleteId = scanner.nextInt();
//
//        // 기능을 구현한 deleteUserById 를 사용하여 회원 삭제 진행
//        ManageUser manageUser1 =  new ManageUser();
//        manageUser1.deleteUserById(deleteId);

          // 회원 목록 조회
        ManageUser manageUser =  new ManageUser();
        manageUser.getAllUsers();



    }
}
