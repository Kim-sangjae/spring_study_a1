package controllers.members;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        // Join 커맨드 객체로 검증을 한정 - 검증클래스범위
        return Join.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // 실제 검증 부분
        Join join = (Join)target; // 형변환을 시켜줘야한다

        /*
        * 1. 필수 항목 체크 - userId , userPw , userPwRe , userNm
        * 2. userId 중복 여부 - 이미 가입된 경우는 가입 불가
        * 3. userPw , userPwRe 의 일치여부
        * 4. 약관동의 여부
        * */
        String userId = join.getUserId();
        String userPw = join.getUserPw();
        String userPwRe = join.getUserPwRe();
        String userNm = join.getUserNm();
        boolean agree = join.isAgree();

        // 1. 필수항목 체크
        if(userId == null || userId.isBlank()){
            errors.rejectValue("userId","Required");
        }

        if(userPw == null || userPw.isBlank()){
            errors.rejectValue("userPw","Required");
        }

        if(userPwRe == null || userPwRe.isBlank()){
            errors.rejectValue("userPwRe","Required");
        }

        if(userNm == null || userNm.isBlank()){
            errors.rejectValue("userNm","Required");
        }






    }//Validator


}
