package day09.inter;

import java.util.ArrayList;

public interface BadAnimal extends Wild, Huntable{

    ArrayList list = null;


    @Override
    void hunt();

    @Override
    void violent();
}
