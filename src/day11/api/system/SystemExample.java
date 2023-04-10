package day11.api.system;

import java.util.Arrays;

public class SystemExample {

    public static void main(String[] args) {

        //운영체제의 현재 시간 읽기
        long time = System.currentTimeMillis();
        System.out.println("time = "+ time);


        //코드

        long time2 = System.currentTimeMillis();

        //배열카피
        int[] arr = {10, 20,30};
        int[] copyArr = new int[arr.length];
                        //원본, 원본의 시작위치, 사본, 사본의 시작위치, 길이
        System.arraycopy(arr, 0, copyArr, 0, arr.length); //배열복제 속도가 빠름(수억개 데이터~~)
        System.out.println(Arrays.toString(copyArr));

    }
}
