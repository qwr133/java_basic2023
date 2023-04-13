package Manage.inventoryManagement;


import static Manage.util.Utility.input;

//재고관리페이지
public class InventoryManagementView {

    public static void InventoryManagementView() {
        System.out.println("아래 원하시는 카테고리 번호를 입력해주세요");
        System.out.println("1. 국가별 조회하기");
        System.out.println("2. 타입별 조회하기");
        System.out.println("3. 전체조회하기");
        System.out.println("9. 뒤로가기");
        String InventoryManagementView = input(">>>");

        switch (InventoryManagementView) {
            case "1":
                //국가별 조회
                OriginWineSelect.OriginWineSelect();
                break;
            case "2":
                //와인타입별 조회
                TypeWineSelect.typeWineSelect();
                break;
            case "3":
                //전체조회
                 WineListSelect.showWine();
                        break;

            case "9":
               ManagerMainView.ManagerView();
                break;
        }

    }


}
