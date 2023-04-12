package Manage;

import JavaProject.Wine;

import java.util.List;
import java.util.stream.Collectors;

import static JavaProject.TotalWine.valueList;
import static Manage.util.Utility.input;

public class TypeWineSelect {
    public static void typeWineSelect() {
        System.out.println("와인타입을 선택하세요");
        System.out.println("1. 레드와인");
        System.out.println("2. 화이트와인");
        System.out.println("3. 스파클링와인");
        System.out.println("4. 로제와인");
        System.out.println("5. 주정강화");
        System.out.println("6. 뒤로가기");
        String TypeWine = input(">>>");


        switch (TypeWine) {
            case "1":
                System.out.println("==레드와인==");
                List<JavaProject.Wine> RedWine = valueList.stream()
                        .filter((w -> w.getWineType() == "레드"))
                        .collect(Collectors.toList());
                System.out.println(RedWine);
                break;

            case "2":
                System.out.println("==화이트와인==");
                List<Wine> WhiteWine = valueList.stream()
                        .filter((w -> w.getWineType() == "화이트"))
                        .collect(Collectors.toList());
                System.out.println(WhiteWine);
                break;

        }

    }
}
