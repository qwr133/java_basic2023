package day05.player;

public class player {
    //필드
    String nickName;
    int level;
    int hp;

    //생성자
    public player(){
        this(nickName : "이름 없음:"); //this(); - 나의 또 다른 생성자를 불러주세요
        System.out.println("1번 생성자 호출!");
        this.nickName="이름없음";
        this.level=1;
        this.hp=50;
    }

    public player(String nickName){
        this(nickName: "");
        this(nickName, level:1, hp:50);
        System.out.println("2번 생성자 호출!");

    }

    public player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    player(String inputName){
        nickName=inputName; //nickName.this (필드) // 지역번수에는 this 불가능
        level=1;
        hp=50;
    }

    //기능 - 메서드
    void attack(player target){

        if(this==target) return;

        System.out.println("target의 주소" + target);
        System.out.println("this 주소" + this);
        //맞은 녀석의 체력을 10~15 랜덤으로 감소시킴
        int damage = (int) (Math.random()*6+10); //맞은 형식으로 변환 alt+enter

        target.hp -= damage;



        //전투로그를 출력할 예정
        //"가해자가 피해자를 공격해서 xxx의 피해를 입힘"
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힘/n",
                        this.nickName, target.nickName, damage );
                    //this : 나 !!(myself)


    }

}
