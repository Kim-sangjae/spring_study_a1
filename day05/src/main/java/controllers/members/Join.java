package controllers.members;

import lombok.Data;

@Data
public class Join { // 커맨드 객체 만들기

    private String userId;
    private String userPw;
    private String userPwRe;
    private String userNm;

    private boolean agree;



}
