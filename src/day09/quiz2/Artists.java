package day09.quiz2;

import day04.array.StringList;

public class Artists {

    private String Artist;
    private StringList songList;

    public Artists(){

    }
    public Artists(String artist, StringList songList) {
        this.Artist = artist;
        this.songList = songList;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public StringList getSongList() {
        return songList;
    }

    public void setSongList(StringList songList) {
        this.songList = songList;
    }

    public void info(){
        System.out.println("가수명"+this.Artist);
        System.out.println("노래목록"+this.songList);
    }
}
