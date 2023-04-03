package day06.encap;


//필드는 다이렉트로 접근하면 위험한 일이 발생할 수 있기 때문에 막아놔야한다
//필드에 대한 접근 잘 제한해둬야한다

public class Car {
    private String model; //모델명
    private int speed; //현재속도
    private char mode; //변속모드(D,N,R,P)
    private boolean start; //시동 온오프 상태

    //생성자 : 객체가 처음 생성될 때 상태
    public Car(String model) {
        this.model = model;
        this.mode = 'P';

// 기본값이니 굳이 작성하지 않아도됨
//    this.speed=0;
//    this.start=false;
    }

    //setter : 필드값을 제어하기 위한 메서드
    public void setSpeed(int speed) {
        if (speed < 0 || speed > 200) return;
        this.speed = speed;
    }

    //getter : 필드값을 참고하기 위한 메서드
    public int getSpeed() {
        //필드에는 km로 저장되어있는데 미국경우 mile로 변환해서 줘야함 --  km-mile 로 변환공식 세팅하면 됨
        return this.speed;
    }

    //getter&setter alt+inset

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'D':
            case 'R':
            case 'N':
            case 'P':
                this.mode = mode;
                break;
            default:
        }
        this.mode = mode;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    //엔진에 연료가 주입되는 기능
    void inject() {
        System.out.println("연료가 주입됩니다");
    }

    //엔진오일이 순환하는 기능
    void putOil() {
        System.out.println("엔진오일이 순환합니다");
    }

    //엔진 실린더가 움직이는 기능
    void moveCylinder() {
        if (start) {
            System.out.println("실린더가 움직입니다");
        } else {
            System.out.println("차가 폭발합니다");
        }
    }

    //시동버튼을 누르는 기능
    void pressButton() {
        this.start = true;
        inject();
        putOil();
        moveCylinder();
        System.out.println("시동이 걸렸습니다");
    }
}
