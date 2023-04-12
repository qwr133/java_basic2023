package day13;

import static day13.Menu.menuList;

public class Finding {

    public static void main(String[] args) {

        //메뉴목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가?
        boolean flag1 = menuList.stream()
                .anyMatch(d -> d.isVegeterian());
        System.out.println("flag1 = "+ flag1);

        boolean flag2 = menuList.stream()
                .anyMatch(d -> d.getCalories() < 100);
        System.out.println("flag2= "+ flag2);

        //메뉴목록에 모든 요리가 1000칼로리 미만인가?
        boolean flag3 = menuList.stream().anyMatch(d -> d.getCalories() < 1000);
        System.out.println("flag3 =" +flag3);

        //nonMatch : allMatch의 반대연산
        //1000보다 작은게 하나도 없으면 true

//        menuList.stream()
//                .min(d->d.getCalories());



    }
}
