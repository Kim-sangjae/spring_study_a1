package models.member;

import java.util.Map;

public class JoinService {

    private MemberDao memberDao;


    //생성자
    public JoinService(MemberDao memberDao){
        this.memberDao = memberDao;
    }


    public void join(Member member){
        memberDao.insert(member);
    }



}
