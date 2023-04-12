package Manage;

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
        System.out.println("6. 뒤로가기");
        String OriginWine = input(">>>");


        switch (OriginWine) {
            case "1":
                System.out.println("== 스페인 와인 ==");
                List<JavaProject.Wine> SpainWine = valueList.stream()
                        .filter(d -> d.getOrigin() == "스페인")
                        .collect(Collectors.toList());
                System.out.println(SpainWine);
                break;

            case "2":
                System.out.println("== 미국 와인 ==");
                List<Wine> USAWine = valueList.stream()
                        .filter(d -> d.getOrigin() == "미국")
                        .collect(Collectors.toList());
                System.out.println(USAWine);
                break;

        }
    }
}
