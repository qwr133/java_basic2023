package day04;

//댄서의 설계도
//설계도에는 main을 만들지 않음

public class dancer {
    //자바에서 변수는 메서드아 안에 있는 것(지역변수만..!)
    //속성 (필드(변수가 아님)
    String dancerName; //댄서 이름

    String crewName;

    String genre;

    int level; //0초보자, 1중수, 2고수

    //생성자(=기술자) : 스카우터, 개발자
    //생성자도 함수 개념,무조건 리턴이 void로 고정. 그러므로 void를 이중작성하지 않음
    //리턴값은 생성한 객체의 주소값을 리턴
    //객체 생성 시 필요한 데이터를 셋팅

    dancer(){
    dancerName="갑돌이";
    crewName="돌아이들";
    genre="힙합";
//    level = danceLevel.AMATUER;
    }

    //생성자 오버로딩
    dancer(String dgenre){
        dancerName="관종킹";
        crewName="써커스왕";
        genre=dgenre;
//        level=danceLevel.BEGINNER;
    }
            //String 변수, dName 필드
    dancer(String dName, String dGenre, danceLevel dLevel){
        dancerName= dName;
        crewName="하하호호";
        genre=dGenre;
//        level=danceLevel.BEGINNER;
    }

    //기능 (메서드) : static 붙이지 마세요
    //춤추는 기능

    void dance() {
        System.out.println(genre+ "춤을 열정적으로 춥니다");
    }

    //스트레칭하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풉니다");
    }

    //자기소개 시능
    String introduce(){
        return String.format("내이름은 %s이고, %s팀에 소속되어 있습니다", dancerName, crewName);
    }
}
