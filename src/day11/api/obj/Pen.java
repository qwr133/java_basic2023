package day11.api.obj;

import java.util.List;
import java.util.Objects;

public class Pen extends Object {

     Company company; //제조회사

     long serial; //시리얼번호
     String color; //색상
     int price; //가격 기본값 0
//     Integer price; 기본값 null (둘 차이 알아두기!!)

     public Pen(long serial, String color, int price) {
          this.serial = serial;
          this.color = color;
          this.price = price;
     }

     //객체의 필드데이터를 빠르게 확인해볼 때
     //toString재정의는 필수
     @Override
     public String toString() {
          return "Pen{" +
                  "company=" + company +
                  ",serial=" + serial +
                  ", color='" + color + '\'' +
                  ", price=" + price +
                  '}';
     }

     //시리얼 번호가 같으면 같은 객체로 보고싶다
     //equals를 오버라이딩하면 반드시 hashCode도 같이 오버라이딩 해라 (equals, hashcode는 같이 오버라이딩하는게 기본적인 룰)
     @Override
     public boolean equals(Object obj) {

          if(obj instanceof  Pen){ //obj 너 Pen의 객체야?
               Pen target = (Pen)obj; //다운캐스팅
               return this.serial== target.serial //주소값까지 동일하게 같다고 표현하지 않기때문에 set에 값이 2개가 나옴
                       && this.color.equals(target.color);
          }

          return false;
     }

//     @Override
//     public int hashCode() {
//          return Objects.hash(serial, Pen);
//     }
}
