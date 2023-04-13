package controllers.members;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDt;
    @AssertTrue // 참이나와야 통과
    private boolean agree;



}
