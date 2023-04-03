package day04.array;

import java.util.Arrays;

//String 배열을 제어하는 설계도
public class StringList {

    //필드
    String[] sArr;

    //생성자
    StringList(){
        sArr = new String[0];

    }

    StringList(String ... initData){
        sArr = new String[initData.length];

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];

        }
        }



    //메서드(기능)
    //1. 배열에 저장된 데이터 수를 알려주는 기능
    int size(){
        return  sArr.length;
    }

    //2.배열에 맨 끝에 데이터를 추가하는 기능
     void push(String newData){
        String[] temp = new String[sArr.length+1];

        //복사
         for (int i = 0; i < sArr.length; i++) {
             temp[i] = sArr[i];

         }
         //temp의 끝 인덱스에서 arr 넣기, 그리고 주소바꾸기
         temp[temp.length-1 ]= newData;
         sArr = temp;
     }
     //배열 맨 끝 데이터 삭제하는 기능
    String pop(){
        //지우기 전에 찾아두고~
        String deleteTarget = sArr[sArr.length-1];

        String[] temp = new String[sArr.length-1];

        for (int i = 0; i <temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
        return deleteTarget;
    }

    //배열 내부 데이터 출력
    public String toString(){
        return Arrays.toString(sArr);
    }


    //배열 텅텅비었는지 확인
     boolean isEmpty () {
         return sArr.length == 0;
     }

    //배열 데이터 전체 삭제
    void clear(){
        sArr = new String[0];

}

//인덱스 탐색 (indexOf)

//자료유무확인 (includes)

//중간삭제 (remove)

//중간삽입 (insert)

}


