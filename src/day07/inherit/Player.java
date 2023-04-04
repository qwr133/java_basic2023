package day07.inherit;

//수퍼클래스(부모클래스) : 객체의 공통 기능과 속성을 설계

public class Player extends Object { //play만 작성시 extents Object가 자동적으로 구성되어있음
    String nickname; //캐릭터 이름
    int level;
    int hp;
    int exp;

    //부모의 생성자
    public Player(String nickname) {
        System.out.println("player의 생성자 호출!");
        this.nickname=nickname;
        this.level=1;
        this.hp=50;

    }

    public void showStatus(){
        System.out.println("\n======Character's Info======");
        System.out.println("#name :"+ this.nickname);
        System.out.println("#level :"+ this.level);
        System.out.println("#hp :"+ this.hp);
    }



}
