package models.member;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {

    private String userId;
    private String userPw;
    private String userNm;

    private LocalDateTime regDt; // 가입일자입력

    private String regDtStr;

}
