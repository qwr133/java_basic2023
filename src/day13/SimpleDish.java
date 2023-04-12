package day13;

public class SimpleDish {

    //요리정보 중 이름, 칼로리만 관리하는 객체

    private final String name;
    private final String calories;

//내용추가필요

    public SimpleDish(String name, String calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                '}';
    }
}
