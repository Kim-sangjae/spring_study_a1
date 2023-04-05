package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class ListService {
    @Autowired
    private MemberDao memberDao;

    public ListService(){}




    public ListService(MemberDao memberDao){
        this.memberDao = memberDao;
    }


    public void print(){

        List<Member> members = memberDao.gets();
        members.stream().forEach(System.out::println);
    }


}
