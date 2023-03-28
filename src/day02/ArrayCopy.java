package day02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        //배열 복사 알고리즘
        String[] pets = new String[] {"멍멍이", "야옹이", "짹쟥이"};

        //선언과 동시에 초기화한다면 new Type[] 셍략가능
        String[] pets2 ={"멍멍이", "야옹이", "짹쟥이"};

//        for(String ) //3/28 11시 수업

//        String[] petsCopy = pets; //기존 3갸짜리 방을 공유하는 것 (복사X) & 주소값은 동일
        pets[1] = "사마귀";

        System.out.println("원본배열 : "+ pets);
//        System.out.println("사본배열 : "+ petsCopy);

        //1. 원본과 동일한 사이즈의 배열을 하나 더 생성
        String[] petsCopy = new String [pets.length];

        // 2. 원본의 각 인덱스값들을 사본에 인덱스로 일일히 복사
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }


        System.out.println("원본배열 : "+ Arrays.toString(pets));
        System.out.println("원본배열 : "+ Arrays.toString(petsCopy));
    }
}
