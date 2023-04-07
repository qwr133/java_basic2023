package day10.exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"강아지", "거북이", "토끼"};

        try {
            for (int i = 0; i < 4; i++) { //pets.length로 하면 에러발생안함
                System.out.println(pets[i] + " 키울래요~");
//                System.out.println("애완동물 조아용~~~"); //3번째 인덱스에는 이 출력문이 안남

            }
            } catch(Exception e){
                System.out.println("애완동물 정보가 없습니다");
            } finally{
                // 예외와 관계없이 항상 실행할 코드
                System.out.println("애완동물 조아용~~~");

                //데이터베이스 접속 후 다음 접속 위해
                //데이터베이스 연결을 종료시켜야 할 경우
            }
        System.out.println("프로그램 정상 종료!");
        }

    }


