package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {


    //정수입력 받아 리턴하는 메서드
    public int inputNumber() throws InputMismatchException { //예외처리 던지기(너가 해줘!)
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;


    }

    //문자열을 정수로 변환하는 기능
    public int convert(String s ) throws NumberFormatException{ //결국에 조상은 Exception인데 그러면 throws Exception으로 해도 되는가?
                                                                // exception으로 하게되면 main에도 exception이 걸리게돼서 쓰면 안되는건가
                                                                // 각각의 exception들을 어느정도는 알고 있어야하나?
                                                    /*
                                                            A: exception으로 던지게 되는 경우 오류는 생기지 않지만
                                                            나중에 try catch 할 때 throwMain에서 보이는 try-catch 구문이 세분화되어 나눠지지 않음
                                                     */
        int n = Integer.parseInt(s);
        return n;

    }

    public void convertAndInput(){
        try {
            int n= inputNumber();
            int m = convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수입력 잘해라");
        } catch (NumberFormatException e) {
            System.out.println("숫자변환 못함");
        }
    }
}
