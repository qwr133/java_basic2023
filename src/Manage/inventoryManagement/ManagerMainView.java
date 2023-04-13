package Manage.inventoryManagement;

        import Manage.Main;
        import Manage.UserInfo.UserManagementView;

        import static Manage.util.Utility.input;

        //관리자메인페이지
public class ManagerMainView {

    private static int InventoryManagement;

    public static void ManagerView() {
        System.out.println("아래 카테고리 중 하나를 선택해주세요");
        System.out.println("1. 재고관리");
        System.out.println("2. 회원관리");
        System.out.println("3. 직원관리");
        System.out.println("9. 뒤로가기");
        String OriginWine = input(">>>");


        switch (OriginWine) {
            case "1":
              InventoryManagementView.InventoryManagementView();

            case "2":
                UserManagementView.UserManagementView();
                //함수

            case "3":
                //함수

            case "9":
//                Main;
        }
    }
}
