package Manage.UserInfo;

import static Manage.util.Utility.input;

public class UserManagementView {
    public static void UserManagementView() {
        System.out.println("아래 원하시는 카테고리 번호를 입력해주세요");
        System.out.println("1. 유저회원 전체 조회하기");
        System.out.println("2. 조건별 회원조회");
        System.out.println("9. 뒤로가기");
        String UserManagementView = input(">>>");

        switch (UserManagementView) {
            //전체회원조회
            case "1":
                UserInfoList.allUser();

                break;

            //조건조회해서 보기
            case"2":
                UserSelect.userSelect();





        }
    }
}
