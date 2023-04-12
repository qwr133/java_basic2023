package day12.inner;

import day06.modi.pac1.A;

public class Main {
    //내부 클래스 (inner class) --- 뺄셈 계산을 하는 계산기만 필요함(파일 만들고싶지 않을때)
    //메인 클래스에는 main에 static 사용 불가, 내부클래스에는 static, public, private 사용 가능
    public static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }


    public static void main(String[] args) {
        //덧셈 계산을 하는 계산기를 만들어서 쓰고 싶다
        Calculator addCal = new AddCalculator();

        System.out.println(addCal.operate(30, 50));

        //뺼셈 계산을 하는 계산기가 필요
        Calculator sub1 = new SubCalculator();
        System.out.println(sub1.operate(100, 40));


    //곱셈 계산을 하는 계산기가 필요(익명 클래스) --클래스 바로 만들기
    Calculator multiCal = new Calculator() { //이름이 없지만, 클래스의 영역임! - 필드선언 가능
//alt+enter하면 람다식으로 바꾸기 알아서 해줌
        //필드 선언


        private String name;

        @Override
        public int operate ( int n1, int n2){
            return n1 * n2;
        }
    };
        System.out.println(multiCal.operate(5,7));

        //나눗셈을 하는 계산기(람다) - 인터페이스의 추상메서드 딱 1개일때만 사용 가능 (2개 이상시 익명클래스 필요)
        //클래스의 객체 (함수X, JS화살표함수는 함수)
        Calculator divCal =  (n1, n2) ->  n1 / n2;

    //1회용 강아지(애견카페)
      Pet dog=  new Pet() {

          @Override
          public void eat() {
              System.out.println("강아지는 간식을 먹어요");
          }

          @Override
          public void play() {
              System.out.println("강아지는 마당에서 놀아요");
          }
      };


    }


    }