package config;

import models.member.InfoService;
import models.member.JoinService;
import models.member.ListService;
import models.member.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

//@Import(AppCtx2.class) // 여러개 입력할때는 {} 안에 입력하면된다 ( Import 는 배열형태 )
@Configuration
public class AppCtx {


    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }


    @Bean
    public JoinService joinService(){
        return new JoinService();
    }


    @Bean
    public ListService listService(){
        return new ListService();
    }



    @Bean
    public InfoService infoService (){
        return new InfoService();
    }


    @Bean
    public DateTimeFormatter dateTimeFormatter (){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");

        return formatter;
    }





}
