package day08.poly.car;

import day06.modi.pac2.C;

import static day07.util.Utility.makeLine;

public class Main {

    public static void main(String[] args) {
        CarShop shop = new CarShop();

        shop.runTest();

        makeLine();

        Driver park = new Driver();

        park.drive(new Mustang());
        park.drive(new Stinger());

        //오버라이딩 된 머스팅이달립니다~ 호출
        Mustang mustang = new Mustang();
        mustang.accelerate();
        mustang.powerSound();


        Stinger stinger = new Stinger();
        stinger.accelerate();

        makeLine();

        //다운캐스팅이기때문에 오류가 생기는데 해결하기위해 타입을 변경해줘야함
//        Mustang car = (Mustang)shop.exportCar(6000);
        Car car = shop.exportCar(6000);

        //자동차인건 알겠는데 무슨 자동차인지 확인하는 방법 -- 잘 사용하지 않음
        System.out.println(car instanceof Stinger); //car가 stinger 객체냐? 아니다(false)
        System.out.println(car instanceof Tucson);
        System.out.println(car instanceof Mustang);


        System.out.printf("car =)" + car);

//        car.powerSound();  car 6000으로할땐 머스탱이 나오는데 이렇게할 땐 안되는거
//        ex.교복입고 있으면 학생할인 가능하지만, 사복입으면 학생할인안되는 느낌


    }
}
////머스탱 기능 중 오버라이딩 기능있고  -- car 타입으로
//순수한 기능이있다
//
//        11:52 분 정리내용