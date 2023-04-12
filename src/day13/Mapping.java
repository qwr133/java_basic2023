package day13;

import day07.util.Utility;
import day13.Dish.Type;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day13.Menu.menuList;

public class Mapping {

    public static void main(String[] args) {
        //stream의 map: 리스트에서 원하는 정보만 추출

        //메뉴 목록에서 요리의 이름들만 목록으로 추출
        List<String> dishNames = menuList.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println("dishNames= "+ dishNames);


        makeLine();

        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> wordLengths = words.stream().map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println(wordLengths);

        makeLine();

        //메뉴 목록에서 메뉴이름과 칼로리를 추출하는데 칼로리를 정수가 아닌 문자열로 kcal을 뒤에 붙여서 추출 후
        //메뉴이름: xxxkcal로 반복 출력하고 싶다
//도수 추가시 %

//람다식
        List<SimpleDish> simpleDishes = menuList.stream()
                .map(dish -> new SimpleDish(dish.getName(), dish.getCalories() + "kcal"))
                .collect(Collectors.toList());


        simpleDishes.forEach(sd -> System.out.println(sd));


//        List<SimpleDish> simpleDishes = menuList.stream()
//                .map(new Function<Dish, SimpleDish>() {
//                    @Override
//                    public SimpleDish apply(Dish dish) {
//                        SimpleDish sd
//                                = new SimpleDish(
//                                dish.getName(),
//                                dish.getCalories() + "kcal");
//
//                        return sd;
//                    }
//                })
//                .collect(Collectors.toList());
//
//        simpleDishes.forEach((sd-> System.out.println(sd)));



//        menuList.stream()
//                .map(dish -> {
//                    String name = dish.getName();
//                    int calories = dish.getCalories();
//                })
//                .collect(Collectors.toList());

        /*
            메뉴목록에서 칼로리가 500칼로리보다 큰 음식들만 필터링 한 다음에 음식의 이름과 타입만 추출해서 출력해주세요

         */

        menuList.stream()
                .filter(d -> d.getCalories() > 500)
                .map(d -> new DishNameType(d))
                .collect(Collectors.toList())
                .forEach(dnt -> System.out.println(dnt));

//메뉴 목록에 있는 요리들의 총 칼로리수 구하기
        int totalCal = menuList.stream()
                .mapToInt(d -> d.getCalories()) //mapping을 int로 처리, int type만 전용으로 작성
                .sum();

        System.out.println(totalCal);


        double averageCal = menuList.stream()
                .filter(d->d.getType()== Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble(); //우리가 흔히 작성하는 average를 원한다면 .getAsDouble()은 꼭 작성!
    }
}

