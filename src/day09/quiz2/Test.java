package day09.quiz2;

import day04.array.StringList;
import day09.quiz2.Artist;

public class Test {

    public static void main(String[] args) {

        ArtistRepository ar = new ArtistRepository();

        ar.addNewArtist("아이유", "분홍신");
        ar.addNewArtist("동방신기", "wrong number");

        Artist foundArtist = ar.findArtistByName("동방신비");
        System.out.println(foundArtist);

    }
}