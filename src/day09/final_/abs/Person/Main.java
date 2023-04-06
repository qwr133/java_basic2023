package day09.final_.abs.Person;

public class Main {

    public static void main(String[] args) {

        Person kim = new Person("김철수",
                "000111-31231234",
                //"대한민국",
                new BagPack(5, "샘소나이트")
        );

        new Person("박영희",
                "991111-1234567",
                //"대한민국",
                null
        );

        kim.name = "김출수";
//        kim.ssn = "021111-2222222";

//        kim.bagPack = new BagPack(10, "기본");

    }
}