package day08.poly.overloading;

/*
    오버라이딩: 부모클래스의 메서드를 자식이 재정의하는 것
    오버로딩: [하나의 클래스 안에서] 같은 이름의 메서드를 여러개 선언하는 것
        조건: 반드시 매개변수의 타입, 순서, 개수가 달라야한다
                리턴타입과 접근제한자는 관련이 없다
 */

//자바는 같은 이름의 함수를 여러개 만들 수 있게 되어있음(조건 확인 필요)
//아무떄나 허용하는 것은 아니고 조건이 있음

public class Over {

    //데이터를 전달하면 데이터의 타입을 알려주는 기능

    //alertType(String)
    void alertType(String s){
        System.out.println("전달된 데이터는 문자열입니다");
    }
    //alertType(int)
    void alertType(int x){
        System.out.println("전달된 데이터는 정수입니다");
    }

    //alertType(int, int) -- return 타입이 달라도 같은 형태의 애들은 못만듬
    void alertType(int x, int y){   }//개수가 다르기 때문에 ok
//    int alertType(int x, int y){
//        return 0;
//    }
    void alertType(int x, String y){   }
    void alertType(String x, int y){   }

    void test(){
        alertType("zzz",10);
    }
}
