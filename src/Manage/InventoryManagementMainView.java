package Manage;

        import static Manage.util.Utility.input;

        //관리자메인페이지
public class InventoryManagementMainView {

    private static int InventoryManagement;

    public static void InventoryManagement() {
        System.out.println("아래 카테고리 중 하나를 선택해주세요");
        System.out.println("1. 재고관리");
        System.out.println("2. 회원관리");
        System.out.println("3. 직원관리");
        System.out.println("4. 뒤로가기");
        String OriginWine = input(">>>");


        switch (OriginWine) {
            case "1":
              //함수

            case "2":
                //함수

            case "3":
                //함수

            case "4":
                //함수
        }
    }
}
