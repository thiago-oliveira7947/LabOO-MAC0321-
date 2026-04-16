package entities;

import java.util.ArrayList;

public class Song {
    
    private String title;
    private String album_name;
    private String composer;
    private String interpreter;
    private int year;

    public Song(String title, String album_name, String composer, String interpreter, int year) {
        this.title = title;
        this.album_name = album_name;
        this.composer = composer;
        this.interpreter = interpreter;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbumName() {
        return album_name;
    }

    public String getComposer() {
        return composer;
    }

    public String getInterpreter() {
        return interpreter;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Song> searchByString(ArrayList<Song> listSong, String keyword) {
        ArrayList<Song> listSongFiltered = new ArrayList<>();

        for(Song song : listSong) {
            if(song.getTitle().contains(keyword) ||
               song.getAlbumName().contains(keyword) ||
               song.getComposer().contains(keyword) ||
               song.getInterpreter().contains(keyword)) {
                listSongFiltered.add(song);
               }
        }
        return listSongFiltered;
    }


    @Override
    public String toString() {
        return "Song's name: " + getTitle() +
               "Album's name: "  + getAlbumName() +
               "Composer's name: " + getComposer() +
               "Interpreter's name: " + getInterpreter() +
               "Song's year: " + getYear();
    }
}
