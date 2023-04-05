package models.member;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.format.DateTimeFormatter;
import java.util.Optional;


public class InfoService {

    @Autowired
    private Optional<MemberDao> opt;
    private DateTimeFormatter formatter;


    public void print(String userId){
        MemberDao memberDao = opt.get();
        Member member = memberDao.get(userId);

        String dateStr = formatter.format(member.getRegDt());
        member.setRegDtStr(dateStr);

        System.out.println(member);
    }


    @Autowired
    public void setFormatter (DateTimeFormatter formatter){

        this.formatter = formatter;
    }



}
