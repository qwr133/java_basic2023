package day10.set;

import java.util.*;

public class SetExample {

    /*
        집합 자료구조
        저장순서를 보장하지 않음
        인덱스, 키를 사용하지 않아서 개별탐색이 불리함
        저장값의 중복을 허용하지 않음 (교집합인 경우 1개 데이터만 출력)
     */

    public static void main(String[] args) {
        Set<String> foodSet = new HashSet<>();

        //중간삽입 삭제 기능이 안됨

        //데이터 추가 add(E e)
        foodSet.add("떡볶이");
        boolean flag1= foodSet.add("김밥");
        foodSet.add("튀김");
        foodSet.add("순대");
       boolean flag2= foodSet.add("김밥");

        System.out.println("foodSet 갯수 : " + foodSet.size());
        System.out.println("foodSet : " + foodSet); //순서없이 나열

        System.out.println("flag1 = "+flag1); //T
        System.out.println("flag2 = "+flag2); //F = 중복데이터

        //fori문은 불가능, iter(for : ) 만 사용가능
        for (String food : foodSet) {
            System.out.println("food = "+ food);

        }

        //remove(obj) : 삭제
        foodSet.remove("튀김");

        System.out.println("foodSet = "+ foodSet);

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,1,1,3,3,5,7,9,9,9)
        );

        //리스트를 set으로 변환 = 코딩테스트 시 유용 --중복제거 할 때 빠르게 사용 가능!!
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = "+ numberSet);


    }
}
