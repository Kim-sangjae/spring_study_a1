package controllers.members;

import lombok.RequiredArgsConstructor;
import models.member.MemberDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator {

    private final MemberDao memberDao;

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

//        String userId = join.getUserId();
//        String userPw = join.getUserPw();
//        String userPwRe = join.getUserPwRe();
//        String userNm = join.getUserNm();
//        boolean agree = join.isAgree();
        String userId = join.getUserId();
        String userPw = join.getUserPw();
        String userPwRe = join.getUserPwRe();

        //2. userid 중복여부
        if (userId != null && !userId.isBlank() && memberDao.isExists(userId)) {
            errors.rejectValue("userId", "Duplicated");
        }

        //3. userPw, userPwRe의 일치여부
        if (userPw != null && !userPw.isBlank()
                && userPwRe != null && !userPwRe.isBlank() && !userPw.equals(userPwRe)) {
            errors.rejectValue("userPwRe", "Incorrect");
        }

        // 공통 에러 테스트
        //errors.reject("common","공통에러테스트!");



        // 1. 필수항목 체크
//        if(userId == null || userId.isBlank()){
//            errors.rejectValue("userId","Required2","아이디입력(기본)");
//        }
//
//        if(userPw == null || userPw.isBlank()){
//            errors.rejectValue("userPw","Required");
//        }
//
//        if(userPwRe == null || userPwRe.isBlank()){
//            errors.rejectValue("userPwRe","Required");
//        }
//
//        if(userNm == null || userNm.isBlank()){
//            errors.rejectValue("userNm","Required");
//        }




        // 스프링프레임워크에 추가되어있는 필수항목 체크 클래스,메서드
        // -...더편한방법도있다.. Bean Validation API -> java ee8 : 검증 API
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userId","Required");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userPw","Required");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userPwRe","Required");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userNm","Required");




    }//Validator


}
