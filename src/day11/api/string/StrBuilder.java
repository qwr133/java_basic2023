package day11.api.string;

public class StrBuilder {

    private static void makeString(){

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 50000; i++) {
            s+="A";

        }
        long end = System.currentTimeMillis();

        System.out.println("스트링 총 소요시간 "+ (end-start) + "밀리초");
    }

    private static void makeStringBuilder(){

        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            s.append("A");

        }
        long end = System.currentTimeMillis();

        System.out.println("스트링 빌더 총 소요시간 "+ (end-start) + "밀리초");
    }

    public static void main(String[] args) {

       makeString();
       makeStringBuilder();

       //객체로 변환되어 상속관계가 생김
//       Integer a = new Integer(10);
       Integer a =10; //위 코드 오토박싱
       Character c = 'A';

       Byte b =1;
       Double e = 11.1;

    }
}
