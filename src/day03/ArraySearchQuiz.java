package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        while (true) {
            System.out.println("수정할 멤버의 이름을 입력하세요");
            String member = sc.nextLine();

            for (int i = 0; i < tvxq.length; i++) {
                if (member.equals(tvxq[i])) {
                    System.out.println(tvxq[i] + "별명을 변경합니다");

                    String changeName = sc.nextLine();
                    tvxq[i] = changeName;
                    System.out.println("변경완료!!/n *변경 후 정보 : " + Arrays.toString(tvxq));
                    break;

                } else {
                    System.out.println(member + "은(는) 없는 이름입니다");
                    break;
                }

            }

        }

    }
}
