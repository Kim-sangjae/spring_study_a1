package models.member;

import controllers.members.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class LoginService {
    @Autowired
    private HttpSession session;
    @Autowired
    private MemberDao memberDao;
    @Autowired
    private HttpServletResponse response; // 쿠키저장위해 받음


    public void login(Login login){
        //1.회원데이터 조회
        Member member = memberDao.get(login.getUserId());

        //2.세션에 로그인 유지
        session.setAttribute("member",member);

        //3.쿠키저장(아이디저장)
        Cookie cookie = new Cookie("saveId",member.getUserId());

        if(login.isSaveId()){ // 아이디저장 체크시( true )
            cookie.setMaxAge(60 * 60 * 24 * 365);
        } else { // 아이디 저장 미 체크 시
            cookie.setMaxAge(0);
        }

        response.addCookie(cookie);




    }


}
