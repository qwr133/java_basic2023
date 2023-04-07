package day10.exception;

public class TryExample1 {

    public static void main(String[] args) {
        int n1 = 10, n2=0; //1

        System.out.println("나눗셈 시작!"); //2

        try {
            //예외 발생 가능성이 있는 코드 << 예외처리
            System.out.printf("%d /%d = %d\n", n1, n2, n1/n2); //3 n2=0일때 에러가 날 수도 있는 코드
        } catch (Exception e) { //예외가 발생하면 처리 할 코드
                                // Exception이 ArithmeticException의 부모이기때문에 왠만해서 Exception 하면 예외처리 다 잡아줌
            System.out.println("0으로 나눌 수 없습니다");
            //개발시에 쓰는 코드(로그 트레이싱(추적))
            e.printStackTrace(); //catch 안에 넣어놓는게 좋음 -- 정상출력은 되지만 Error 내용을 확인 할 수 있음
        }

        //예외 발생 가능성이 있는 코드는 예외처리  - 날 수도 있고, 안날 수 도 있는 코드
        //무조건 에러나는 코드 = 무조건 지우기
//        String s = null;
//        s.length();

        System.out.println("프로그램 정상 종료"); //4

    }



}
