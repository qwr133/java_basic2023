package day11.api.obj;

import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        Pen p1 = new Pen(123, "빨강", 1000);
        p1.company= new Company("모나미", "서울");

        Pen p2 = new Pen(123, "빨강", 1000);

        System.out.println(p1.toString()); //toString이 생략되어있지만 toString의 return 값이 출력됨

        System.out.println(p1.equals(p2));

        Set<Pen> penSet = new HashSet<>();
        penSet.add(p1);
        penSet.add(p2);

        System.out.println(penSet.size());
        //set에서는 중복제거가 되지 않음

        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(Integer.toHexString(p2.hashCode()));
    }
}
