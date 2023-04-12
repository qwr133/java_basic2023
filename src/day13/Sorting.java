package day13;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day13.Menu.menuList;

public class Sorting {

    public static void main(String[] args) {

        //stream의 정렬 sorted

        //메뉴목록 중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(Comparator.comparing(d->d.getCalories())) //알아서 다 해줌(오름차순)
                .collect(Collectors.toList())
                .forEach(d-> System.out.println(d));

        //메뉴 목록 중 이름 내림차 정렬 (zyx순)
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed()) //알아서 다 해줌(오름차순) -메소드 참조 후 .reversed로 하기(람다로는 적용x, 새로운 에러이슈)
                .collect(Collectors.toList())
                .forEach(d-> System.out.println(d));


    }
}
