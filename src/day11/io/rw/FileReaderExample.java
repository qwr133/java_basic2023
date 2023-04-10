package day11.io.rw;

import day05.member.Gender;
import day05.member.member;
import day11.io.RootPath;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Member;
import java.util.Arrays;

public class FileReaderExample {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(RootPath.ROOT_PATH + "/member.txt")) {

            // 버퍼 스트림
            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            System.out.println("s = " + s);

            String[] split = s.split(",");
            System.out.println(Arrays.toString(split));

            member member = new member(Integer.parseInt(split[0]), split[1], split[2], split[3], Gender.valueOf(split[4]), Integer.parseInt(split[5]));
            System.out.println(member.inform());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}