package day03;

public class ArraySearch {
    public static void main(String[] args) {

        String [] foods = {"삼겹살", "족발", "피자", "햄버거"};




        foods[0] = foods[1];
        foods[2] ="치킨";

        //인덱스 탐색 알고리즘 (선형탐색(순방향, 역방향, 한명씩 다 물어보기)-실행속도 느림
        //                  이진탐색-오름차(정렬)필요)
        int index = -1; //찾지 못할수도 있으니
        String target ="치킨";
        for (int i = 0; i < foods.length; i++) {
            if(target.equals(foods[i])){
                index=i;
                break;
            }
        }
        System.out.println("찾은 인덱스 : "+ index  );



    }
}
