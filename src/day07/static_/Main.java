package day07.static_;

import static day07.static_.Count.m1;
import static day07.static_.Count.x;
import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;
import static java.lang.Math.random;
import static java.lang.System.out;


public class Main {

    public static void main(String[] args) {

        out.println(x);
        out.println(random());

        m1(new Count());

        Count c1 = new Count();
        Count c2 = new Count();

        m1(c2);

        c1.m2();

        x = 10;
        c2.y = 20;

        x++;

        out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);


        Calculator cal1 = new Calculator(); // kim
        Calculator cal2 = new Calculator(); // park

        cal1.color = "빨강";
        cal2.color = "초록";

        out.println("cal1 = " + cal1.color);
        Calculator sharp = new Calculator();
        Calculator.calcAreaCircle(5);

        sharp.paint("노랑");

        makeLine();
        makeLine();
        input("하하호호: ");



    }
}