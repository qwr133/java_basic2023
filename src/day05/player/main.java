package day05.player;

public class main {
    public static void main(String[] args) {

        player parking = new player(inputName : "주차왕파킹");
        player gondue = new player(inputName : "딸긔겅듀");

        player noname= new player();

        gondue.attack(parking);
        System.out.println("parking의 주소"+ parking);
        System.out.println("gondue 주소"+ this);




//        System.out.println("주차왕 남은 체력: "+ parking.hp);
    }
}
