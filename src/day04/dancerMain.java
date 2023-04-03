package day04;
//실행용 클래스
// 여기엔 설계하지 않고 main 메서드를 작성합니다

public class dancerMain {

    public static void main(String[] args) {
        dancer kim = new dancer();
        System.out.println(kim); //즈소값 출력

        dancer park = new dancer("스트릿댄스");
        dancer jang = new dancer("장동견", "목각댄스", danceLevel.PRO);


//        singer song = new singer();
        System.out.println(kim);
        System.out.println(park);



        System.out.println(kim.introduce());
        System.out.println(park.introduce());
        kim.dance();
        park.dance();



    }
}
