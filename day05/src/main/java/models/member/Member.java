package models.member;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {

    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private LocalDateTime regDt;

}
