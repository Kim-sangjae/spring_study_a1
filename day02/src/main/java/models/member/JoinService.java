package models.member;

import org.springframework.beans.factory.annotation.Autowired;

public class JoinService {


    private MemberDao memberDao;



    public void join(Member member){
        memberDao.insert(member);
    }


    @Autowired
    public void setMemberDao (MemberDao memberDao){
        this.memberDao = memberDao;
    }









}
