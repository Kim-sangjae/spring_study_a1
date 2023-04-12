package controllers.members;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Join { // 커맨드 객체 만들기

    @NotBlank
    @Size(min=6,max=16)
    private String userId;
    @NotBlank
    @Size(min=8)
    private String userPw;
    @NotBlank
    private String userPwRe;
    @NotBlank
    private String userNm;
    @Email
    private String email;
    @AssertTrue // 참이나와야 통과
    private boolean agree;



}
