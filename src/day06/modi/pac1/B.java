package day06.modi.pac1;

class B { //default 제한: 클래 스에는 public과 default만 사용가능 (private, protect 사용 불가)
    //아무런 접근제한자를 사용하지않음 -- 4시수업 5~10분뒤쯤
//클래스에 default 제한을 건다는 의미는 A입장에서 B랑 같은 패키지 소속인데
//            A입장에서 B의 객체를 생성해서 비의 입는 데이터의 접근을 한다하면
//    rpivate 제한 빼고는 다 접근이 가능하다
//            씨 입장에서 비의 입장을 접근한다면 비의 모든 것을 다 차단하겠다
//            차이는 씨 입장에서 비의 퍼블릭도 못가져오게 하고싶으면 클래스의 default를 작성하면됨
//           (강력한 제한)
// class 에서 default를 걸어버리면 그 안에 퍼블릭이 뭐고 아예 접근이 안됨
    //b의 대한 접근이 아예 안되게 할 때 클래스 라인에 public을 뺌

    public int x1;
    int x2;
    private int x3;




    void test() {
        A a = new A(); // public
        new A(10); // default
//        new A("zzzz"); // private


        a.f1 = 1;  // public
        a.f2 = 2;  // default //동일한 패키지 안에서는 모두 가능
//        a.f3 = 3;  // private

        a.m1(); // public
        a.m2(); // default
//        a.m3(); // private
    }
}
