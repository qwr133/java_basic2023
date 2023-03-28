package day02;

import java.util.Scanner;

public class SwitchExample {

    public static final  String SPRING ="봄";
    public static void main(String[] args) {

        System.out.println("###여행지 추천 ####");
        System.out.println("[원하는 계절을 입력하세요 .]");
        System.out.print(">>"); //봄 여름 가을 겨울

        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
//
//        //switch에는 정수, 문자형 변수를 써야한다 (무조건 변수)
//        switch (season){
//            //case "상수"만 가능
//            case "봄": case "Spring": case "spring" :
//                System.out.println("봄에는 여의도를 가세요");
//                break;
//            case "여름": case "summer" : case "Summer" : //case 중복나열 가능
//                System.out.println("여름에는 홍천을 가세요");
//                break;
//            case "가을": case "fall" : case "Fall":
//                System.out.println("가을에는 춘천을 가세요");
//                break;
//            case "겨울": case "Winter" : case "winter":
//                System.out.println("겨울에는 평창을 가세요");
//                break;
//            default: //else와 같은 효과
//                System.out.println("계절을 다시 입력해주세요 ^-^");
//        }

        //ctrl +d 복붙
        // CTRL SHIFT  방향키아래 - 아래로 이동
        System.out.print("정말로 종료합니가? [y/n] >>");

        String answer = sc.nextLine();

        switch (answer.toLowerCase().charAt(0)) { //charat 타입이 char 타입임으로 case y,n 홀따옴표로 작성
            case 'y':
                System.out.println("종료합니다!");
                break;
            case 'n':
                System.out.println("취소합니다!");
                break;
        }


        }
    }


