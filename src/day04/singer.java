package day04;

public class singer {
    //클래스 아래 만들어졌기때문에 sangerName -- 지역변수?
    String singerName;
    int b = 20;

    //매개변수가 없는 생성자를 기본생성자
    //클래스 안에서 생성자가 하나도 없을 경우 자동 생성 (있으면 자동생성 아예안함)
    singer(int c) {
        int a = 10;
    }

    void hello() {
        double g = 2.2;

        for (int i = 0; i < 5; i++) { //i지역변수

        }
    }

    boolean flag = false;

}

//3/30 1030~