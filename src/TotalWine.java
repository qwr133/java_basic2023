//package wine;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class TotalWine {
//
//    private static Map<Integer, Wine> wineMap = new HashMap<>();
//
//    static {
//        wineMap.put(1, new Wine("엠 바이 빌라 엠", "이탈리아", "화이트", 20.0,3.0));
//        wineMap.put(2, new Wine("아바찌아 블루문 모스카토", "이탈리아","스파클링",25.0, 8.0));
//        wineMap.put(3, new Wine("산테로 피노 샤르도네 스푸만테", "이탈리아",   "스파클링", 30.0, 11.5));
//        wineMap.put(4, new Wine("바바 로제타 2021", "이탈리아", "로제", 51.0, 6.0));
//        wineMap.put(5, new Wine("마시 캄포피오린",   "이탈리아",   "레드", 65.0, 14.0));
//        wineMap.put(6, new Wine("우니꼬 브린디시 리제르바"   "이탈리아"   "레드"   , 70.0, 13.5));
//        wineMap.put(7, new Wine("카스텔로 디 볼파이아, 빈산토 델 키안티 클라시코 2000","이탈리아","화이트",81.0, 16.5));
//        wineMap.put(7, new Wine("프라텔리 세리오 & 바티스타 보르고뇨, 가비 2019",   "이탈리아",   "레드", 87.0   , 13));
//        wineMap.put(7, new Wine("빌라 요란다 아스티", "이탈리아", "스파클링", 10.0, 8.0));
//        wineMap.put(7, new Wine("가야, 프로미스", "이탈리아", "레드",11.0, 14.0));
//        wineMap.put(7, new Wine("라 마싸, 라 마싸",	"이탈리아", "레드", 12.0, 18.0));
//        wineMap.put(7, new Wine("카스텔로 디 아마, 빈산토", "이탈리아", "화이트", 13.0, 15.0));
//        wineMap.put(7, new Wine("그라빠 디 바롤로 42 아피나타", "이탈리아", "주정강화", 14.0, 42.0));
//        wineMap.put(7, new Wine("알렉산더, 안드로메다 프로세코", "이탈리아", "고도주", 14.5, 38.0));
//        wineMap.put(7, new Wine("루피노, 모두스", "이탈리아", "레드", 15.0, 14.5));
//        wineMap.put(7, new Wine("체레토, 바롤로" , "이탈리아", "레드", 16.5, 14.0));
//        wineMap.put(7, new Wine("가야, 마가리",  "이탈리아", "레드", 17.8, 14.0));
//        wineMap.put(7, new Wine("안티노리, 체르바로" , "이탈리아", "화이트", 18.0,	13.0));
//        wineMap.put(7, new Wine("베르시 세리리니, 프란치아 코르타 브뤼 뀌베 로제", "이탈리아", "로제", 20.0, 12.5));
//        wineMap.put(7, new Wine("데니스 몬타나, 베르두쪼", "이탈리아", "화이트", 25.8, 12));
//        wineMap.put(7, new Wine("도메니꼬 끌레리꼬, 바롤로 페르크리스티나", "이탈리아", "레드", 75.0, 14.5));
//        wineMap.put(7, new Wine("돔 페리뇽 빈티지 2012",  "프랑스", "스파클링", 350.0, 13.0));
//        wineMap.put(7, new Wine("파이퍼 하이직, 레어 2002" ,"프랑스", "스파클링", 350.0, 12.0));
//        wineMap.put(7, new Wine("샤또 몽로즈 2016" ,"프랑스", "레드" , 400.0, 14.0));
//        wineMap.put(7, new Wine("니콜라스 푸이야트, 팔메 도르 브뤼 2006", "프랑스", "스파클링", 450.0, 12.0 ));
//        wineMap.put(7, new Wine("칼바도스 1978","프랑스", "주정강화", 377.0, 42.0));
//        wineMap.put(7, new Wine("샤또 딸보 2019", "프랑스", "레드", 130.0, 14.0  ));
//        wineMap.put(7, new Wine("로랑 페리에, 브뤼 L-P", "프랑스", "스파클링", 164.0, 13.0 ));
//        wineMap.put(7, new Wine("떼땅져, 녹턴", "프랑스", "스파클링", 231.0, 12.5));
//        wineMap.put(7, new Wine("샤또 쉬뒤로 2018", "프랑스", "화이트", 130.0, 14.0  ));
//        wineMap.put(7, new Wine("샤또 빠쁘 클레망 2017" ,"프랑스", "레드",  220.0, 14.0));
//        wineMap.put(7, new Wine("샹파뉴 바롱 드 로칠드, 브뤼", "프랑스", "스파클링", 220.0, 12.0));
//        wineMap.put(7, new Wine("샤또 브랑 깡뜨냑 2017", "프랑스", "레드", 170.0, 14.0 ));
//        wineMap.put(7, new Wine("뛰느방, 배드 보이 골드 2007", "프랑스", "레드", 300.0, 16.0 ));
//        wineMap.put(7, new Wine("올리비에 르플레브, 뫼르소 2016", "프랑스", "화이트", 280.0, 13.0 ));
//        wineMap.put(7, new Wine("샤또 꼬스 데스뚜르넬 블랑 2017", "프랑스", "화이트", 200.0, 14.0 ));
//        wineMap.put(7, new Wine("라이온즈 드 쉬드로 2013", "프랑스", "화이트", 130.0, 14.0 ));
//        wineMap.put(7, new Wine("조셉 페리에, 뀌베 로얄 로제", "프랑스", "스파클링", 183.0, 12.0 ));
//        wineMap.put(7, new Wine("엠마뉴엘 브로쉐 라타피아 09-14" ,"프랑스", "주정강화", 281.0, 17.5 ));
//        wineMap.put(7, new Wine("모엣 샹동 임페리얼", "프랑스", "스파클링", 75.0, 12.0));
//        wineMap.put(7, new Wine("모엣 샹동 로제 임페리얼", "프랑스", "스파클링", 88.5, 12.0));
//        wineMap.put(7, new Wine("무똥 까데 레드 2013", "프랑스", "레드", 40.0, 14.0));
//        wineMap.put(7, new Wine("압생트" ,"프랑스", "주정강화", 99.0, 47.0 ));
//        wineMap.put(7, new Wine("키르 로얄", "프랑스", "스파클링", 60.0, 12.0));
//        wineMap.put(7, new Wine("샤또 몽바지악 2008", "프랑스", "화이트", 99.0, 13.0));
//        wineMap.put(7, new Wine("샤또 몽투스 2016" ,"프랑스", "레드", 100.0, 14.5));
//        wineMap.put(7, new Wine("루이 자도 샤블리 2021", "프랑스", "화이트", 43.0, 13.0));
//        wineMap.put(7, new Wine("로쉐 마제, 메를로 2021" ,"프랑스", "레드", 22.0, 13.0 ));
//        wineMap.put(7, new Wine("뿌삐유 2017", "프랑스", "레드", 60.0, 14.5 ));
//        wineMap.put(7, new Wine("루이 자도, 부르고뉴 피노누아 2021", "프랑스", "레드", 35.0, 12.5));
//        wineMap.put(7, new Wine("블루 넌, 까베르네 소비뇽 2020", "프랑스", "레드", 20.0, 14.0 ));
//        wineMap.put(7, new Wine("노블 메독 2017", "프랑스", "레드", 26.0, 13.0 ));
//        wineMap.put(7, new Wine("더 롱 독 루즈 2017", "프랑스", "레드", 29.0, 13.0 ));
//        wineMap.put(7, new Wine("이기갈, 꼬뜨 뒤 론 블랑 2021", "프랑스", "화이트", 29.8, 13.5 ));
//        wineMap.put(7, new Wine("블라송 부르고뉴 피노 누아", "프랑스", "레드", 28.8, 13.0 ));
//        wineMap.put(7, new Wine("도멘 라파주, 아무르 로제 2017", "프랑스", "로제", 25.0, 16.0 ));
//        wineMap.put(7, new Wine("시모네 페브르, 크레망 드 부르고뉴 브뤼", "프랑스", "스파클링", 50.0, 13.0));
//        wineMap.put(7, new Wine("마르티우스 마그니피캇 2019" ,"프랑스", "레드", 20.0, 12.0 ));
//        wineMap.put(7, new Wine("모건 데이비드 콩고드", "미국", "레드", 12.0, 11.0));
//        wineMap.put(7, new Wine("칼로 로씨 상그리아", "미국", "레드", 10.0, 10.0));
//        wineMap.put(7, new Wine("롱반 샤도네이 2021", "미국", "화이트", 24.0, 13.5));
//        wineMap.put(7, new Wine("조쉬셀러스-조쉬샤르도네", "미국", "화이트", 60.0, 13.5));
//        wineMap.put(7, new Wine("캐년로드,화이트진판델" , "미국", "로제", 14.9, 9.0));
//        wineMap.put(7, new Wine("11th아워셀러즈 화이트진판델", "미국", "로제", 55.0, 11.0));
//        wineMap.put(7, new Wine("갤로 패밀리 화이트 진판델 2012", "미국", "로제",  25.0, 9.0));
//        wineMap.put(7, new Wine("더 페데럴리스트 진판델", "미국", "레드",  50.0, 14.1));
//        wineMap.put(7, new Wine("페처메를로이글피크" , "미국", "레드", 55.0, 13.5));
//        wineMap.put(7, new Wine("옥토포다 나파 까베르네 쇼비뇽", "미국", "레드", 70.0, 13.5));
//        wineMap.put(7, new Wine("델리카토 날리 헤드 까베르네 소비뇽 2019" , "미국", "레드", 55.0, 13.5 ));
//        wineMap.put(7, new Wine("더 아톰, 샤도네이 2018", "미국", "화이트", 55.0, 13.5));
//        wineMap.put(7, new Wine("찰스앤찰스샤도네이", "미국", "화이트", 64.0, 14.0));
//        wineMap.put(7, new Wine("덕혼 빈야드 나파 밸리 샤도네이", "미국", "화이트", 80.0, 14.1));
//        wineMap.put(7, new Wine("콘 크릭 소노마카운티 진판델 2013", "미국", "레드", 10.0, 14.5));
//        wineMap.put(7, new Wine("리머릭 레인 에스테이트 블렌드 2017", "미국", "레드", 10.0, 14.8));
//        wineMap.put(7, new Wine("아니체 셀라즈 세븐 게이블스 2015", "미국", "레드", 10.0, 14.0));
//        wineMap.put(7, new Wine("크루즈 랜초 시마일즈 발디귀에 2019 ", "미국",  "레드", 80.0, 12.0));
//        wineMap.put(7, new Wine("보글 샤도네이 2017 ", "미국", "화이트", 10.0, 14.0));
//        wineMap.put(7, new Wine("조엘 고트 오레건 피노그리 2015 ", "미국", "화이트", 85.0, 14.1));
//        wineMap.put(7, new Wine("나파 셀라 샤도네이 2020", "미국", "화이트", 130.0, 14.3));
//        wineMap.put(7, new Wine("키슬러 러시안 리버 밸리 피노누아", "미국", "레드" , 25.0, 13.9));
//        wineMap.put(7, new Wine("Quinta da Devesa LBV Porto", "포르투갈", "레드", 280.0, 20.0 ));
//        wineMap.put(7, new Wine("Quinta da Devesa Tinto", "포르투갈", "레드", 18.3, 14.0));
//        wineMap.put(7, new Wine("퀸타 다 데베사 비냐스 벨랴스 리제르바 틴토", "포르투갈", "레드", 210.0, 14.5 ));
//        wineMap.put(7, new Wine("퀸타 다 데베사 블랑코" , "포르투갈", "화이트", 48.0, 13.0 ));
//        wineMap.put(7, new Wine("퀸타 다 데베사 리제르바 틴토", "포르투갈", "레드", 54.0, 14.5));
//        wineMap.put(7, new Wine("퀸타 다 데베사 20 아노스 타우니 포트" ,  "포르투갈", "레드", 52.0, 20.0 ));
//        wineMap.put(7, new Wine("카살 다 코엘레이라 리제르바 틴토" ,  "포르투갈", 16.0, 14.3 ));
//        wineMap.put(7, new Wine("카살 다 코엘레이라 리제르바 블랑코",  "포르투갈", 14.0, 13.2 ));
//        wineMap.put(7, new Wine("빈센테 파리아 아니무스 도우로",  "포르투갈", "화이트", 13.0, 13.0));
//        wineMap.put(7, new Wine("파시스 불독", "포르투갈","레드와인", 48.0, 12.0));
//        wineMap.put(7, new Wine("비냐 로스 밸리 리오하 크리안자 블랜드 템프라니요/그라시아노", "스페인", "레드", 14.0, 14.0 ));
//        wineMap.put(7, new Wine( "핀카 라 에스탕케라 틴토", "스페인", "레드",  35.0, 16.0    ));
//        wineMap.put(7, new Wine("비냐 로스 밸리 리오하 템프라니요", "스페인","레드", 1.6, 13.5));
//        wineMap.put(7, new Wine("온디푸에르코 블랑코" , "스페인", "화이트", 1.6, 12.5));
//        wineMap.put(7, new Wine("카사 솔라 레드" , "스페인", "레드" , 4.0, 12.5));
//        wineMap.put(7, new Wine("보데가 드 모야 몰라 로제", "스페인", "로제", 55.0, 13.0 ));
//        wineMap.put(7, new Wine("보데가 드 모야 몰라 레드", "스페인", "레드", 50.0, 14.5));
//        wineMap.put(7, new Wine("페냐 엘 가토 내추럴 가르나차", "스페인", "레드", 22.0, 15.5));
//        wineMap.put(7, new Wine("산 그레고리오 아나키스타 가르나차", "스페인", "레드",  35.0, 16.0));
//        wineMap.put(7, new Wine("무르비에르도 올가닉 브륏 로제", "스페인", "스파클링", 15.0, 11.5));
//        wineMap.put(7, new Wine("엔트레 비얀 오니릭 펫낫", "스페인", "스파클링", 28.0, 12.5));
//        wineMap.put(7, new Wine("치비테  나바라 리제르바 컬렉션 125" , "스페인", "레드", 80.0, 13.5));
//        wineMap.put(7, new Wine("Cirsion Rioja 시르시온 리오하", "스페인", "레드", 540.0, 15.0));
//        wineMap.put(7, new Wine("비냐 톤도니아 그랑 리제르바 2001",  "스페인",  "레드", 320.0, 12.0));
//        wineMap.put(7, new Wine("토넬레스 모스카텔","스페인", "레드" ,395.0, 18.0));
//        wineMap.put(7, new Wine("우니꼬 2003", "스페인", "레드" , 1000.0,  14.0));
////        wineMap.put(7, new Wine("꼰따도르 리오하 2003" , "스페인", "레드" 470.0, 0)); 도수확인불가
//        wineMap.put(7, new Wine());
//        wineMap.put(7, new Wine());
//        wineMap.put(7, new Wine());
//        wineMap.put(7, new Wine());
//        wineMap.put(7, new Wine());
//        wineMap.put(7, new Wine());
//
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//
//    }
//
//
//}