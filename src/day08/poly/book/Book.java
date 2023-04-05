package day08.poly.book;

public class Book {

    private String title; //도서명
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    //3시 다른 내용 추가
    //책 정보 문자열 생성
    public  String info(){
        //문자열 글자 수 얻기 length()
        int length = this.title.length();
        String prettier;
        if(length>8){
            //문자열 슬라이스 substring()
            prettier=  this.title.substring(0,8) + "..."; //0부터 8미만!!(0,1,7)
        }else{
            prettier = this.title;
        }
        return String.format("제목: %s", prettier);
    }
}
