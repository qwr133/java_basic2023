package day04.array;

public class main2 {

    public static void main(String[] args) {

        StringList foodList = new StringList();
        foodList.push("짜장면");
        foodList.push("볶음밥");
        foodList.push("탕수육");

        StringList userNameList = new StringList();
        userNameList.push("김철수");
        userNameList.push("박영희");

        System.out.println("foodList가 비었니? :" +foodList.isEmpty());
        foodList.clear();


        System.out.println("foodList = " + foodList);
        System.out.println("foodList.size() = " + foodList.size());
        System.out.println("userNameList = " + userNameList);
        System.out.println("userNameList.size() = " + userNameList.size());
    }
}

//3.30