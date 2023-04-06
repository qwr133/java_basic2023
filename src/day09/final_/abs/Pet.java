package day09.final_.abs;


//추상화
//1. 객체생성불가
//2. 메서드는 오버라이딩을 위한 껍데기 역할에 국한되도록 제한

public abstract class Pet {
    private String name;
    private String kind;
    private int age;

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //오버라이딩을 위한 메서드 작성 (오버라이딩을 위한 껍데기)
    //  클래스가 추상이 아니면 추상 메서드 선언 불가


    public abstract void takeNap();

    public abstract void eat();

    //선택기능(고양이x, 강아지 o) -사용원하기 내 맘대로
    public void walk(){
        System.out.println("애왕동물을 산책합니다");
    }


}
