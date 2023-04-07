package day10.collection.list;


import day07.util.Utility;

import java.util.*;

/*
    -저장 데이터의 순서를 보장
    - 인덱스를 가지고 있음
    - 중복 데이터를 저장 가능

 */
public class ListExample {
    public static void main(String[] args) {

        List<String> foodList = new ArrayList<>(); //기본값 : 10개배열
                                    //ArrayList는 10개값이 기본값으로 10개가 차야 다음으로 넘어감 - 메모리과부화 방지

        //add(E e) : 끝 추가
        foodList.add("짜장면");
        foodList.add("짬뽕");
        foodList.add("닭강정");
        foodList.add("탕수육");
        foodList.add("마라탕");

        //add(index, element) : 중간삽입 (오버로딩)
        foodList.add(2, "족발");

        //size(): 저장된 데이터 개수를 반환
        int size = foodList.size();
        System.out.println("size = " + size);

        System.out.println(foodList); //println(foodList.toString()) toString이 자동으로 불러오게 되어있음(생략가능)

        //indexOf(E e) : 해당 데이터의 인덱스 반환
        int index = foodList.indexOf("파스타12");
        System.out.println("index = "+ index);

        //contains(E e): 해당 데이터 저장 유무 확인
        System.out.println(foodList.contains("짜장면")); //T
        System.out.println(foodList.contains("마파두부")); //F

        //remove(index), remove(obj) : 제거
        String removeFood = foodList.remove(1);
        foodList.remove("탕수육"); //만약 중복값일 경우, 맨 앞에 있는 데이터만 삭제됨

        System.out.println("foodList = " + foodList);

        //set(index, newElement): 수정
        foodList.set(0, "동파육");

        System.out.println("foodList = "+ foodList);

        //get(index) : 리스트에 저장된 데이터 참조
        String s = foodList.get(1); //foodList[1] 의 배열을 .get(1)로 표현
        System.out.println("s =" + s);

        Utility.makeLine();
        //반복문처리
        for (int i = 0; i < foodList.size(); i++) { //length 대신 size로 표현
            System.out.println(foodList.get(i));

        }

        Utility.makeLine();
        for (String food: foodList){
            System.out.println("food = "+ food);
        }

        //clear(): 내부 데이터 전체 삭제
        foodList.clear();

        System.out.println("foodList = "+ foodList);
        System.out.println(foodList.isEmpty()); //T

        //리스트에 초기값 넣고 시작하기
        List<String> tvxq = new ArrayList<>( //(생성자의 매개변수 자리)
                Arrays.asList("윤호윤호", "최강창민")

        );
        System.out.println("tvxq = "+ tvxq);


        //정렬(듀얼 피벗 퀵 정렬)
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(5,3,7,1,8)
        );


        Utility.makeLine();
        System.out.println("numbers = "+ numbers);
        System.out.println("numbers = "+ numbers);

        //오름차 정렬
        Collections.sort(numbers);
        System.out.println("numbers = "+ numbers);

        //내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = "+ numbers);
    }

}
