package day07.lotto;

public class Lotto {

    public static void information() {

        int[] Lotto = new int[7];

        for (int i = 1; i < Lotto.length; i++) {
            Lotto[i] = (int) (Math.random() * 45) + 1;

            //중복제거
            for (int j = 1; j < i; j++) {
                if (Lotto[i] == Lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        //출력
        System.out.print("로또 번호 :");
        for (int i = 1; i < 8; i++) {
            System.out.print(Lotto[i] + "");
        }

    }




    public static void main(String[] args) {

        Lotto.information();
    }

}