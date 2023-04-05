package day08.poly;

public class Main {

    public static void main(String[] args) {

        // 객체는 항상 역할에 의존해야지 구현제에 의존하면 안됨
        //예, 편의점 사장이 알바생한테 의존해야지, 한명에게만 의존하면 안됨
        //ex, 뮤지컬에서 역할에 의존하기 때문에 2~3명을 캐스팅해두듯이
        Computer com = new Computer();
        Lgmonitor lgmonitor = new Lgmonitor();

        com.lgmonitor=lgmonitor;

        //모니터교환
//        com.Monitor=new HpMonitor();
    }
}
