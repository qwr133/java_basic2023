package Manage;

import day13.Dish;
import day13.comparator.Student;

import java.util.ArrayList;
import java.util.List;

import static day13.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class UserMain {

    public static final List<User> UserList;

    static {
        UserList = List.of(
                new User("송철수", "aaaa", "1234"),
                new User("박영희", "bbbb", "1234"),
                new User("손흥민", "cccc", "1234"),
                new User("김민재", "dddd", "1234")
        );
    }

    public static void main(String[] args) {
        List<User> filteredList = UserList.stream()
                .collect(toList());
        System.out.println(filteredList);
    }




}
