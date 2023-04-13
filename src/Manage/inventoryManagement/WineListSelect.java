package Manage.inventoryManagement;

import JavaProject.Wine;

import static JavaProject.TotalWine.valueList;
import static Manage.util.Utility.input;

public class WineListSelect {

    public static void showWine() {



        // valueList의 크기
        int size = valueList.size();

        // 10개씩 출력하는 반복문
        for (int i = 0; i < size; i += 10) {
            System.out.println("=== " + (i + 1) + " ~ " + Math.min(i + 10, size) + " ===");
            for (int j = i; j < Math.min(i + 10, size); j++) {
                Wine wine = valueList.get(j);
                System.out.println("Wine #" + (j + 1) + ": " + wine.getName() + ", " + wine.getOrigin());
            }
            System.out.println();
        }
    }
}

