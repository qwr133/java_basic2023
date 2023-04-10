package day10.song;

import day09.quiz2.MusicView;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        // 세이브파일 자동로드
        ArtistRepository.loadFile();

        MusicView.start();


    }
}
