package day09.final_.abs.Person;



class SmartBagPack extends BagPack {

    public SmartBagPack(int size, String brand) {
        super(size, brand);
    }

//    void putItem() {
//
//    }

    @Override
    void getItem() {
        super.getItem();
    }
}

class BagPack {
    // 속성
    int size; // 가방 크기 (1 ~ 10)
    String brand; // 브랜드
    // 기능
    final void putItem() {
        System.out.println("가방에 물건을 넣습니다.");
    }
    void getItem() {

    }

    public BagPack(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }
}
public class Person {

    String name; // 이름
    final String ssn; // 주민번호

    // 상수는 불변성, 유일성
    static final String nation; // 국적
    final BagPack bagPack; // 가방

    static  {
        nation = "대한민국";
    }

    public Person(final String name, final String ssn, BagPack bagPack) {
        this.name = name;
        this.ssn = ssn;
        this.bagPack = bagPack;
    }

}