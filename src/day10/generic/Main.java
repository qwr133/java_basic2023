package day10.generic;

public class Main {
    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple()); //바나나 못담음
        Apple apple = ab.getApple();


        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana= bb.getBanana();

        Basket<Apple> apples = new Basket<>();
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana()); 에러

        Apple Fruit = apples.getFruit();

        Basket<Banana> bananas = new Basket<>();
        bananas.setFruit(new Banana());
//        bananas.setFruit(new Apple()); 에러

        Banana Fruit1 = bananas.getFruit();


        //ArrayList<Integer> objects





    }
}
