package Manage.UserInfo;

import static Manage.util.Utility.input;

public class UserbyAge {

    public static void UserbyAge() {
        System.out.println("아래 원하시는 카테고리 번호를 입력해주세요");
        System.out.println("이름 오름차순으로 조회");
        System.out.println("연령대별 조회"); //20~30 , 30~40, 40~50, 50~60, 60~
        String userAge = input(">>>");

        switch (userAge) {
            case "1":

                //이름 오름차순으로 조회
                break;
            case "2":
                //연령대별 조회
                break;
        }
    }
}