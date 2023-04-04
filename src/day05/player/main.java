package day05.player;

public class main {

    public static void main(String[] args) {

<<<<<<< HEAD
        Player parking = new Player("주차왕파킹");
        Player gondue = new Player("딸긔겅듀");
        System.out.println("===========================");
        Player noname = new Player();
=======
        player parking = new player("주차왕파킹");
        player gondue = new player("딸긔겅듀");
        System.out.println("===========================");
        player noname = new player();
>>>>>>> f97ef0628e3f85e3c53430096ad1349df9f94ef0

        gondue.attack(gondue);
        System.out.println("parking의 주소: " + parking);
        System.out.println("gondue의 주소: " + gondue);
//        System.out.println("주차왕 남은체력: " + parking.hp);
    }
}
