package day11.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//할 수는 있으나 반복문 돌려서 할 필요까지 없음
public class FileInputExample {

    public static void main(String[] args) {

        String path= "D:\\java_basic2023\\src\\day01\\Scope.java";

        try(FileInputStream fis = new FileInputStream(path)){

            int data = 0;

            while (data != -1){
                data=fis.read();
                System.out.write(data); //아스키를 문자로 출력
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
