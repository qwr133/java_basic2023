package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO { //stand Input, output
    public static void main(String[] args) throws IOException {

        String dog = "멍멍이", cat = "야옹이";

        System.out.println(dog);
        System.out.print(cat);

        int month = 10;
        int day = 3;
        String anni = "개천절";

        System.out.println(month + "월" + day + "일은" + anni + "입니다");

        //%d: 정수, %s : 문자열, %f 실수
        System.out.printf("%d 월 %d일은 %s 입니다.", month, day, anni);

        double rate = 25.4567;
        // %f 무조건 자리수를 6자리로 표현 (%.nf 입락혀만 됨, n은 숫자)
        System.out.printf("오늘의 할인율은 %.2f%%입니다", rate);
        //%.2f입니다 -> 띄어쓰기 안해도 %.2f%% 두개 입력하면 바로 가능


        //표준아웃
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt(); //정수입력 받을 때, 잘 사용하지 않음, 무조건문자로 받아야함
        String str = sc.nextLine();

//        int result=0;
//        try {
//            result = integer.parseInt(str);
//        } catch (Exception e) {
//            System.out.println("정수로 입력");
//        }


//        System.in.read();
//        int result = System.in.read();
        System.out.println("result=" + result);


    }
}
