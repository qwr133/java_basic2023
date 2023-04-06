package day09.quiz;

public class Main {

    public static void main(String[] args) {

        SmartPhone[] smartPhones = {
//                new Galaxy("갤럭시"),
//                new IPhone("아이폰")
        };
        for (SmartPhone smartPhone : smartPhones) {
            String message = smartPhone.information();
            System.out.println(message);
        }

        for(SmartPhone smartPhone: smartPhones){
            String message2= smartPhone.charge();
            System.out.println();
        }
    }
}