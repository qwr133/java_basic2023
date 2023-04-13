package Manage.inventoryManagement;

import JavaProject.Wine;

import java.util.List;
import java.util.stream.Collectors;

import static JavaProject.TotalWine.valueList;
import static Manage.util.Utility.input;

public class OriginWineSelect {
    public static void OriginWineSelect() {
        System.out.println("국가를 선택하세요");
        System.out.println("1. 스페인");
        System.out.println("2. 이탈리아");
        System.out.println("3. 프랑스");
        System.out.println("4. 미국");
        System.out.println("5. 포르투갈");
        System.out.println("9. 뒤로가기");
        String OriginWine = input(">>>");


        switch (OriginWine) {
            case "1":
                System.out.println("== 스페인 와인 ==");
                List<JavaProject.Wine> SpainWine = valueList.stream()
                        .filter(w -> w.getOrigin() == "스페인")
                        .collect(Collectors.toList());
                System.out.println(SpainWine);

                int filteredSpain = 0;
                for (JavaProject.Wine obj : valueList) {
                    if (isFiltered(obj)) { // 필터링 조건에 맞는지 확인하는 메소드 호출
                        filteredSpain++;
                    }
                }

                // 필터링된 객체들의 총 개수 출력
                System.out.println("총합: " + filteredSpain);

                break;

            case "2":
                System.out.println("== 이탈리아 와인 ==");
                List<Wine> ItalyWine = valueList.stream()
                        .filter(w -> w.getOrigin() == "이탈리아")
                        .collect(Collectors.toList());
                System.out.println(ItalyWine);

                int filteredItaly = 0;
                for (JavaProject.Wine obj : valueList) {
                    if (isFiltered(obj)) { // 필터링 조건에 맞는지 확인하는 메소드 호출
                        filteredItaly++;
                    }
                }

                // 필터링된 객체들의 총 개수 출력
                System.out.println("총합: " + filteredItaly);

                break;





            case "3":
                System.out.println("==프랑스 와인 ==");
                List<Wine> FranceWine = valueList.stream()
                        .filter(w -> w.getOrigin() == "프랑스")
                        .collect(Collectors.toList());
                System.out.println(FranceWine);

                int filteredFrance = 0;
                for (JavaProject.Wine obj : valueList) {
                    if (isFiltered(obj)) { // 필터링 조건에 맞는지 확인하는 메소드 호출
                        filteredFrance++;
                    }
                }

                // 필터링된 객체들의 총 개수 출력
                System.out.println("총합: " + filteredFrance);

                break;

            case "4":
                System.out.println("==미국 와인==");
                List<Wine> USAWine = valueList.stream()
                        .filter(w -> w.getOrigin() == "미국")
                        .collect(Collectors.toList());
                System.out.println(USAWine);

                int filteredUSA = 0;
                for (JavaProject.Wine obj : valueList) {
                    if (isFiltered(obj)) { // 필터링 조건에 맞는지 확인하는 메소드 호출
                        filteredUSA++;
                    }
                }

                // 필터링된 객체들의 총 개수 출력
                System.out.println("총합: " + filteredUSA);

                break;

            case "5":
                System.out.println("==포루투갈 와인==");
                List<Wine> PortugalWine = valueList.stream()
                        .filter(w -> w.getOrigin() == "포루투갈")
                        .collect(Collectors.toList());
                System.out.println(PortugalWine);

                int filteredPortugal = 0;
                for (JavaProject.Wine obj : valueList) {
                    if (isFiltered(obj)) { // 필터링 조건에 맞는지 확인하는 메소드 호출
                        filteredPortugal++;
                    }
                }

                // 필터링된 객체들의 총 개수 출력
                System.out.println("총합: " + filteredPortugal);
                break;

            case "9":
                InventoryManagementView.InventoryManagementView();
        }


        }

    private static boolean isFiltered(Wine obj) {
        if (obj.getOrigin().equals("미국")) {  ///이 부분 질문하기!!!!!!!!!!!!!!!!!!!!!!!!!!
            return true;
        } else {
            return false;
        }
    }

}



