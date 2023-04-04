package day07.protec.pac2;

import day07.protec.pac1.A;

public class D extends A {

    D(){
        super(10);
        f1=1; //super 생성자는 접근이 이렇게 가능함 (2시 15분)
//        f2=2;

        m1();
//        m2();
    }
}
