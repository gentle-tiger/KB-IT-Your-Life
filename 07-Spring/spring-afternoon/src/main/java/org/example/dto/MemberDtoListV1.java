package org.example.dto;

import java.util.ArrayList;
import java.util.List;

public class MemberDtoListV1 {
    private static MemberDtoListV1 instance;
    private List<MemberDto> memberDtoList;

    private MemberDtoListV1(){
        this.memberDtoList = new ArrayList<MemberDto>();
        this.addList("tetx", "이효석");
        this.addList("jkhh", "최호진");
    }

    // 싱글톤
    // synchronized : 자바는 멀티스레드를 지원하는데, 해당 데이터를 동시에 접근하는 것을 막아주는 역할을 한다.
    public static synchronized MemberDtoListV1 getInstance(){
        if(instance == null){
            instance = new MemberDtoListV1();
        }
        return instance;
    }

    public void addList(String id, String name){
        memberDtoList.add(new MemberDto(id, name));
    }

    public List<MemberDto> getList(){
        return memberDtoList;
    }
}
