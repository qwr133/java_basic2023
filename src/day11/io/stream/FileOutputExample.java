package day11.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//강의 4/10 12:30 전후
public class FileOutputExample {

    public static void main(String[] args) {

        String msg = "멍멍이는 ~~ 왈왈 ~ \n 하하호호";

        //데이터를 외부로 내보낼 때 출력스트림 사용
        //try with resource 문법 = 알아서 auto closing해줌 - finally 주석부분
        try( FileOutputStream fos = new FileOutputStream("D:/exercise/dog.txt");){

            //스캐너처럼 closed 해줘야함

            fos.write(msg.getBytes());
            System.out.println("파일 저장 성공!");

        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 처리에 실패했습니다");
        } catch (IOException e) {
            System.out.println("출력 시스템에 문제가 생겼습니다.");
        }


//        finally {
//            try {
//                if(fos!=null) fos.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }


    }
}
