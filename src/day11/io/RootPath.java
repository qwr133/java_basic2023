package day11.io;

public interface RootPath {

    //인터페이스는 핃드를 못가짐, 모든 변수가 상수화
    //자동으로 PUBLIC STATIC FINAL이 붙음
    String ROOT_PATH = "D:/exercise";

    String MEMBER_SAVE_PATH=ROOT_PATH+"/member";            //파일 정리 필요

}
