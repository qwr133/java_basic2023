package day08.poly.book;

import day04.array.StringList;
import day08.poly.car.CarShop;

import static day08.poly.book.RentStatus.*;
import static day08.poly.book.RentStatus.RENT_SUCCESS_WITH_COUPON;

//도서관 시스템 데이터 처리
public class LibraryRepository {

    //1
     private static BookUser bookUser; //1명의 회원 (여러명인 경우 배열로 처리)

     //도서들의 정보2
    private  static  Book[] bookList; //여러권의 책들

    static {
        bookList = new Book[] {
                new CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12)
        };
    }


    //유저를 등록하는 기능 (입출력X)
    public void register(BookUser userInfo){
        bookUser = userInfo;
        //static이라 this가 없음
    }

    //마이페이지 기능3
    /*
        여기에 있는 bookUser 정보 리턴

     */

    BookUser findBookUser(){
        return bookUser;
    }

    public String[] getBookInfoList(){
        String[] infoList = new String[bookList.length];
        for (int i = 0; i < infoList.length; i++) {
            infoList[i] = bookList[i].info();
        }
        return infoList;
    }

    // 검색어를 받으면 해당 검색어를 포함하는 제목을 가진
    // 책 정보들을 반환
    public String[] searchBookInfoList(String keyword) {
        StringList list = new StringList();
        // bookList를 뒤져야 됨.
        for (Book book : bookList) {
            String title = book.getTitle(); // 책 제목
            if (title.contains(keyword)) {
                // 검색어에 걸린 책의 정보문자열
                String info = book.info();
                list.push(info);
            }
        }
        return list.getsArr();
    }
    public  RentStatus rentBook(int rentNum){
        //대여를 원하는 책 추출 (index 번호)
        Book wishbook = bookList[rentNum - 1];

        //책의 분류에 따라 다른 처리
        if (wishbook instanceof CookBook){
            //wishbook type은 booktype
            //iscookbook은 cookbook에 전역메소드 (머스탱이 베기음 예시와 같음)
            //-> wishbook을 cookbook type으로 다운캐스팅 해야한다
            CookBook cookBook = (CookBook) wishbook;
//            if(((CookBook) wishbook).isCoupon()) 이렇게도 가능한지??
            //쿠폰유무 확인
            if(((CookBook) wishbook).isCoupon()){
                bookUser.setCouponCount(bookUser.getCouponCount()+1);
                return RENT_SUCCESS_WITH_COUPON;
            }else{
                return RENT_SUCCESS;
            }
        }else if (wishbook instanceof CartoonBook){
            //연령제한 확인
            if (bookUser.getAge() >= ((CartoonBook) wishbook).getAccessAge()){
                //빌릴 수 있는 경우
                return RENT_SUCCESS;
            }else {
                return RENT_FAIL;
            }
        }
        //이걸 걸지 않으면 } 에러가 남
        return  RENT_FAIL;
    }

}
