package day13.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("송철수", 15, 79),
                        new Student("박영희", 14, 52),
                        new Student("손흥민", 18, 83),
                        new Student("김민재", 16, 68)
                )
        );

        //나이순으로 오름차 정렬(나이 적은 순)
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
                //o2.getAge()-o1.getAge(); -- 내림차 정렬
            }
        });

        //이름 가나다순으로 오름차순
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()); //아스키코드로 하나씩 비교해서 가나다 순으로 정렬됨
            }
        });

        studentList.forEach(s-> System.out.println(s));
    }
}
