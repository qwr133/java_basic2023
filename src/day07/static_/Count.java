package day07.static_;

public class Count {

    // 제한자(modifier)
    // 접근제한자(Access)[public, default, private], 사용 제한자(Usage)
    public static int x;  // 정적 필드 : 모든 객체가 공유
    public int y;         // 인스턴스 필드(동적) : 객체별로 관리


    // 정적 메서드
    public static void m1(Count c4) {
        System.out.println("static메서드 호출!");
        // 필드 참조 (static메서드 안에서는 static필드만 참조가능)
        // static은 this정보를 알수가 없어서 호출불가능
        // static에서 객체를 이용하려면 정확하게 명시해줘야함
        System.out.println("x = " + x);
//        System.out.println("y = " + y);

        Count c3 = new Count();
        System.out.println("c3.y = " + c3.y);
        System.out.println("c4.y = " + c4.y);

    }
    // 인스턴스 메서드
    public void m2() {
        System.out.println("인스턴스 메서드 호출!");
        System.out.println("x = " + x);
        System.out.println("y = " + this.y);
    }


}