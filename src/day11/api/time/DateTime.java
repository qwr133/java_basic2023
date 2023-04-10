package day11.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

//        Date date = new Date(); Deprecated- 곧 사라지게 될 기능 (사용X)
//        Calendar calendar = Calendar.getInstance(); calendar 기본값이 1sunday로 되어있어서 항상 +1 같은거 작성해줘야하는 번거로움 발생
//        calendar.get(Calendar.MONTH);

        //현재날짜 정보 얻기 (연,월,일)
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = "+ nowDate);

        //시, 분, 초
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        //연월일시분초
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTIme = "+ nowDateTime);

        //원하는 날짜정보만 얻기
        int year = nowDateTime.getYear();
        System.out.println("year = "+ year);


        Month month = nowDateTime.getMonth();
        System.out.println("month = "+ month);

        //특정날짜 만들기
        LocalDateTime targetDate = LocalDateTime.of(2023, 6, 6, 9, 0);
        System.out.println("targetDate = "+ targetDate);


        //날짜연산
        //도서 대여 시스템에서 빌린날짜로부터 3일후가 반납일
        LocalDateTime rentalDate = LocalDateTime.now();
        LocalDateTime returnDate = rentalDate.plusDays(3); //빌린 날짜 이후로 3일 후
        System.out.println("retunDate = "+ returnDate);

        LocalDateTime targetDateTime = returnDate.plusYears(1).plusMonths(2).plusDays(10).plusHours(5);
        System.out.println("targetDateTime = "+ targetDateTime);

        //사이 날짜 구하기
        LocalDate b = LocalDate.of(2019, 12, 28);
        LocalDate d = LocalDate.of(2023, 04, 10);

        long between = ChronoUnit.DAYS.between(b, d);
        System.out.println("between = "+ between);

        System.out.println("nowDateTime = "+ nowDateTime);

        //날짜 포맷 바꾸기
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");

        String dateString = nowDateTime.format(pattern);
        System.out.println("dateString = "+ dateString);

    }
}
