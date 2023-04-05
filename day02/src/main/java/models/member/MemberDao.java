package models.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberDao {
    private static Map<String,Member> members = new HashMap<>();


    // 회원가입 부분
    public void insert(Member member){
        members.put(member.getUserId(),member);
        member.setRegDt(LocalDateTime.now());
    }


    public Member get(String userId){
        return members.get(userId);
    }



    // Map 형태의 멤버 리스트정보를 가져올수있는 메서드
    public List<Member> gets(){

        List<Member> list = new ArrayList<>(members.values());
        return list;
    }




}
