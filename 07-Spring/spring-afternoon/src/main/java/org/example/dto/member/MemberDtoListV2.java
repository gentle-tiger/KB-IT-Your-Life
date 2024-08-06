package org.example.dto.member;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberDtoListV2 {
    private List<MemberDto> memberDtoList;

    private MemberDtoListV2() {
        this.memberDtoList = new ArrayList<MemberDto>();
        this.addList("tetx", "이효석 v2");
        this.addList("jkhh", "최호진 v2");
    }

    public void addList(String id, String name) {
        memberDtoList.add(new MemberDto(id, name));
    }

    public List<MemberDto> getList() {
        return memberDtoList;
    }
}
