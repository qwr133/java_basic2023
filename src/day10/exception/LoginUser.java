package day10.exception;

public class LoginUser {

    String userAccount; //가입된 계정명
    String userPassword; //가입 시 설정한 패스워드

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    //로그인 검증
    public String loginValidate(String inputAccount, String inputPassword)
            throws LoginValidateException {

        // 회원 계정이 존재하는가?
        if (userAccount.equals(inputAccount)) {
            // 패스워드가 일치하는가?
            if (userPassword.equals(inputPassword)) {
                // 로그인 성공
                return "SUCCESS";
            } else {
                // 패스워드가 틀림
                //throw 새로운 에러를 "발생시킬거야!!" - 원인은 (" ") 이거야!!! --경고를 주기 위함
                //프로그램입장에선 에러가 아니고 우리가 확인하려고 발생하는 에러명 작성..!! --loginvalidaeException 클래스 가보기
                throw new LoginValidateException("비밀번호 똑바로 치세요!");
            }
        } else {
            // 계정정보가 틀림
            throw new LoginValidateException("회원가입부터 하세요!");
        }
    }

}
