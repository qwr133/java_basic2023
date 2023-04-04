package day07.static_;

public class Calculator {
    String color; //계산기 색상
   static double pi; //원주율 --바뀌지 않는 값으로 하나만 만들고 돌려쓰면 됨

    //원의 넓이를 구하는 메서드
    static double calcAreaCircle(int r){
        return pi*r*r;
    }

    //계산기에 색칠을 예쁘게 칠하는 기능 (static 붙이면 안됨)
    void paint(String color){
        this.color=color;
    }

}
