package day01;

public class Casting {
    public static void main(String[] args) {
        byte a =100;
        int b =a;


     /*   upcasing 하는 경우에는 문제가 없지만
                downcasting 하는 경우에는 한번 더 생각하기*/


        //MSB: 0은 양수, 1은 음수
        // c: 0 0000000 00000000 00000011 11101000
        int c =1000;

        // d: 11101000
      /*  btye d= (byte)c;
        System.out.println("d = "+ d);*/

        //다운캐스팅은 데이터 소실의 위험성이 있다
        double x = 3.5566;
        int y = (int)x;  //소수점 버리게됨
        System.out.println("y ="+y);


        short n = 20;
        byte  m = (byte)n;
        System.out.println(m);

        //타입이 다른 데이터의 연산
        //타입이 다르면 큰 타입에 맞춰서 변환후 연산 진행
        int k = 100; //100.0
        double j = 5.5;

        double v = k + j;

       /* char c1 ='A'; => int c1 ='A =65로 바뀜'
        int alpha =1;
        */

        //int 보다 작은 데이터끼리 연산은 무조건 둘 다 int로 변환된다
        //byte, short char => int로 변환
        char c1 ='A';
        byte alpha =1;
        System.out.println(c1 + alpha); //65로 나옴

        byte b1= 100;
        byte b2= 20;
        int b3 = b1+b2; // 이 경우에도 int로 자동 변환됨!!


        int g = 24;
        double result = (double)g/ 5;
        System.out.println("result =" + result);




    }
}
