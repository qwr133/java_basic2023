package day08.car;

public class CarShop {

    Car[] cars;


//    Mustang[] mustangs;
//    Stinger[] stingers;
//    Tucson[] Tucson;

    //대리점에 차를 입고하는과정

    public void importCar(){



        //다형석으로 car로 묶어 배열 안에 넣기가 가능
        cars = new Car[]{
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Stinger(),
                new Tucson()

        };

        //문자열과 정수와 논리를 배열에 담을 수 있다
        //object 배열은 모든 조상의 왕이기 때문에 모든 값을 다 넣을 수 있다
        //모든게 다 호환되어 좋지만 아무거나 넣으면 안됨
        Object[] oArr= {
                40, 50, 3.3, "zzz", false, new Mustang()
        };
    }

    //주행 테스트 기능
    public void runTest(){
        importCar(); //차 입고, 머스탱3대, 스팅거 1대, 투싼 1대
        for(Car car : cars){
            car.accelerate(); //재정의에 의해서 각 차마다의 sout을 넣음
        }
    }

    //차를 고객에게 인도하는 기능
    //리턴타입에 적용되는 다형성
    public  Car exportCar(int money){
        if(money == 6000) {
            return new Mustang();
        }else if(money==5000){
            return new Stinger();
        } else if (money == 3000) {
            return new Tucson();
        }else {
            return null;
        }
    }

    
}
