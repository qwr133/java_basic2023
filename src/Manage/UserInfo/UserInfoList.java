package Manage.UserInfo;



import java.util.ArrayList;
import java.util.List;

public class UserInfoList {

    List<UserInfo> UserInfoList = new ArrayList<>(
            List.of(
                    new UserInfo("abcd", "1234", "조규성", "강남", 30),
                    new UserInfo("qwer", "1234", "김민재", "서초", 28),
                    new UserInfo("asdf", "1234", "손흥민", "대치", 32),
                    new UserInfo("zxcv", "1234", "이강인", "역삼", 26)

            )
    );

    public static void allUser() {

        UserInfo userInfo = new UserInfo(); // UserInfo 객체 생성
        String UserInfo = userInfo.getUserName(); // userName 값 가져오기

        while (userInfo.getUserName()!=null){
            System.out.println("회원조회 : " + UserInfo);

        }
        System.out.println("모두 조회되었습니다.");

    }

}
