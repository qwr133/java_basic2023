package day04;

import fruit.Grape;


public class packagePractice {

    public static void main(String[] args) {
        new juice.apple();

        new fruit.Banana();

        //같은 패키지에 있을 시 에러가 뜨지 않고 알아서 생략이 되는데
        //지금 같은 경우엔 다른 패키지 안에 있으니 앞에 패키지명을 꼭 입력해야함
        //. 입력하기 싫을때, Banana만 적고 싶을 때 import를 package 아래, clss 위에 작성해야함

        new Grape();




    }
}
