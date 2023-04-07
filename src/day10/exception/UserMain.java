package day10.exception;

import java.sql.SQLOutput;

public class UserMain {
    public static void main(String[] args) {

        LoginUser loginUser= new LoginUser("abc123", "1234");

        try {
            loginUser.loginValidate("abc125", "1111");
        } catch (LoginValidateException e) {
            //e.getMessage : 에러원인 메세지를 리턴
            System.out.println(e.getMessage());
        }
    }
}
