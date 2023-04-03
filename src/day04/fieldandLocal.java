package day04;

public class fieldandLocal {

    int a; //a 필드 -초기화하지 않아도 기본값이 들어가있음
//    double[] b; => 기본값 null

    void mm(int b){ //b 매개변수
        int c=0; //c 지역변수 - 기본값을 입력해주고시작해야함

        if(a>10){
            c=99;
        }else if(a<5){
            c=-100;
        }else{
            c=55;
        }

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);


    }
}
