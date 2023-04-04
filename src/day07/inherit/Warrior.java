package day07.inherit;

//서브 클래스(자식 클래스)
public class Warrior extends  Player{


    int rage; //분노게이지

    public Warrior() {
        this("이름없음");
    }

    public  Warrior (String nickname){
        super(nickname); //부모의 생성자를 부르는 코드가 숨어있음. 그래서 main에 player로 호출하지 않아도 출력하면 나옴!!
        this.rage =20;
    }

    //오버라이딩
    //조건: 부모의 시그니처(리턴타입, 이름, 파라미터)를 똑같이 사용
    //      접근제한자는 무조건 부모보다 public 해야함, 부모의 변수 타입도 일치해야함
    @Override //검사
    public void showStatus() {
        super.showStatus();

        System.out.println("#rage :"+this.rage);
    }

    //파워슬래시
    public void powerSlash(){
        System.out.println("파워슬래시를 시전합니다");






    }



}
