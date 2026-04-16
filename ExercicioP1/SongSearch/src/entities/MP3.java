package entities;

import java.util.ArrayList;

public class MP3 extends Song {
    
    private int byteSize;

    public MP3(String title, String album_name, String composer, String interpreter, int year, int byteSize) {
        super(title, album_name, composer, interpreter, year);
        this.byteSize = byteSize;
    }

    public int getByteSize() {
        return byteSize;
    }

    @Override
    public String toString() {
        return super.toString() + "Song's size in bytes: " + getByteSize();
    }

    public ArrayList<MP3> searchBySize(ArrayList<Song> listSong, int byteSize) {
        ArrayList<MP3> listSongFiltered = new ArrayList<>();

        for(Song song : listSong) {
            if(song instanceof MP3) {
                MP3 mp3 = (MP3) song;

            if(mp3.getByteSize() > byteSize) {
                listSongFiltered.add(mp3);
            }
            }
        }
        return listSongFiltered;
    }
}
