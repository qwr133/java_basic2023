package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
/*
        3개의 에러가 발생하기 때문에 Try catch를 하나로 묶어 예외처리하기
        Ctrl + Alt + T 눌러서 try catch로 묶기 (해당부분 드래그)
 */
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("정수 1 : ");
            int n1 = sc.nextInt(); //inptMismatchExcpetion - 정수값을 입력할 때 발생

            System.out.print("정수 2: ");
            String strN2 = sc.next();
            int n2= Integer.parseInt(strN2); //NumberFormatException - 변환할 수 있는 정수값을 입력하지 않을 때 발생

            int result = n1/n2; //ArithmeticException

            System.out.println("result  = "+ result);

            //다중예외처리
        } catch (InputMismatchException e) {
            System.out.println("첫번째 숫자는 정수로만 입력해주세요");
        } catch (NumberFormatException e) {
            System.out.println("두번째 숫자도 정수로만 입력해주세요");
        } catch (Exception e) {
            System.out.println("알 수 없는 에러입니다. 관리자에게 문의하세요."); // 10, 0 입력시 나오는 안내 에러
//            System.out.println("예외가 발생함!");
        }
        System.out.println("프로그램 정상 종료");

    }
}
