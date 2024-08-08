package org.example.dto.member;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
//@AllArgsConstructor
// final 이 붙은 것에만 한해서 사용한다. bean은 유일해야하고 싱글톤을 유지해야하기 때문이다
//@RequiredArgsConstructor
public class MemberRepository {
    private MemberMapper memberMapper;

    @Autowired
    public MemberRepository(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }
//    AllArgsConstructor 가 대신 생성자를 만들어준다.
//    // java bean 의 메서드를 의존성 주입 받아서 한다.
//    @Autowired
//    public MemberRepository(MemberMapper memberMapper) {
//        this.memberMapper = memberMapper;
//    }


    public List<MemberDto> findAll(){
        return memberMapper.findAll();
    }



}


