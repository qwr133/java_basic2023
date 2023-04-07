package day10.generic;

public class Basket<Fruit> { //담고싶은 과일을 나중에 알려줘 < >
                                //관례상 generic type은 복제타입임으로 한글자로만 표현 함 <F>
                                //객체 생성 시 <F>가 다 세부글자로 바뀌기 때문에 크게 의미가 없음(Apple, Banana etc)
                            //ArrayList<>에도 비슷

    private Fruit fruit;


    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}
