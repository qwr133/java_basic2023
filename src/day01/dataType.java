package day01;

public class dataType {

    public static void main(String[] args) {


       /* 10진수 1000 : 0011 1110 1000
            8bit = 1byte;
        1024byte = 1kb*/

//        int a = 30000;
        //영상으로 보낼때는 1byte로 촘촘하게 보내는 편
        long money = 21474836470L;

/*        100; //메모리에 저장 (정수 리터럴은 기본 4바이트 할당)
        int a; //4바이트 공간 할당 이름을 a 부여
        a= 100; // 미리 저장된 100을 a에 복사
        */

        //실수 리터럴은 기본 8바이트 할당
//        float 4바이트 : 다운캐스팅
        float f1 = 1.2345678f;

        System.out.println("f1 = " + f1);

        double d1 = 1.2345654686541321;
        System.out.println("d1 = " + d1);

        boolean TRUE = true;
        //논리타입
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = TRUE;

        //문자 타입 : 한글자, 홀따옴표
        char c1 = 'A';
        System.out.println(c1 + 1); //66
        System.out.println((char) (c1 + 1)); //B

        char c2 = 44032;
        System.out.println("c2 =" + c2); //가

        //String 기본타입이 아니라 객체다!!!!!!(char 배열)
        String s = "hello";
//        객체는 동작과 속성을 가지고 있기 때문에 함수를 사용할 수 있음


    }
}
