package Manage.UserInfo;

import static Manage.util.Utility.input;

public class UserSelect {
    //조건별로 회원조회하기
    //1. 이름 순으로 조회
    //2. 나이대로 조회, 20, 30, 40,50,60이상
    public static void userSelect() {
        System.out.println("아래 원하시는 카테고리 번호를 입력해주세요");
        System.out.println("이름순으로 조회");
        System.out.println("연령대별 조회"); //20~30 , 30~40, 40~50, 50~60, 60~
        String userSelect = input(">>>");

        switch (userSelect) {
            case "1":
//                SortUserInfo.sortUserInfoList();


                break;
            case "2":
                //연령대별 조회
                break;
        }

    }
}


