package day13;

import java.lang.reflect.Type;

public class Dish {
    //final 모든 요리는 다를 수 있지만 final 붙으면 값을 못바꿈

    private final String name; //요리이름
    private final boolean vegeterian; //채식주의 여부
    private final int calories;
    private final Type type; //요리 카테고리


public enum Type{
    MEAT, FISH, OTHER;
}

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    //final 붙으면 setter은 못만들음


    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
