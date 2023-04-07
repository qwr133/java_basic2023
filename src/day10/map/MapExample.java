package day10.map;

import day07.util.Utility;
import day09.quiz2.Artist;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //두개의 제너릭(key, value) = 보통 키 값은 String, value는 object 사용도 가능
        //현업에서도 String, Object를 사용 많이함
        Map<String, Object> map = new HashMap<>();

        //put(k,v): 데이터 추가
        map.put("카드 잔액", 5000);
        map.put("좋아하는 가수", new Artist("아이유", null));
        map.put("저녁메뉴", "솔솥");

        System.out.println(map.size());

        //get(key) : 데이터 참조
        Object dinner = map.get("저녁메뉴");
        System.out.println("dinner = " + dinner);


        //object 타입은 꼭 다운캐스팅이 필요
        //        String dinner = (String)map.get("저녁메뉴");
        //        dinner.toString();

        //        Artist artist = (Artist) map.get("좋아하는 가수");
        //        artist.info();

        System.out.println(map);
        //이미 존재하는 키를 사용하면 수정!!
        map.put("저녁메뉴", "짬뽕");


        //반복문 처리 map.keySet() --iter사용이 안되기때문에 map.keySet사용
        for(String key : map.keySet()){
            System.out.println("key = "+ key);
            System.out.println("value = "+ map.get(key));
            Utility.makeLine();

        }
    }
}
