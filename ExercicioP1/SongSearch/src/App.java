import entities.Song;
import entities.CD;
import entities.LP;
import entities.MP3;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Song> listSong = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("Enter the song's title: ");
            String title = sc.nextLine();
            System.out.println("Enter the albums' name: ");
            String songName = sc.nextLine();
            System.out.println("Enter the composer's name: ");
            String composerName = sc.nextLine();
            System.out.println("Enter the interpreter's name: ");
            String interpreterName = sc.nextLine();
            System.out.println("Enter the song's year: ");
            int year = sc.nextInt();
            System.out.println("Enter number 1 to MP3, 2 to LP and 3 to CD: ");
            int type = sc.nextInt();

            switch(type) {
                case 1:
                    int byteSize = sc.nextInt();
                    MP3 mp3 = new MP3(title, songName, composerName, interpreterName, year, byteSize);
                    listSong.add(mp3);
                    break;
                case 2:
                    double velocity = sc.nextDouble();
                    LP lp = new LP(title, songName, composerName, interpreterName, year, velocity);
                    listSong.add(lp);
                    break;
                case 3:
                    CD cd = new CD(title, songName, composerName, interpreterName, year);
                    listSong.add(cd);
                    break;   
            }
        }
        System.out.println("Enter the year of the song you search: ");

        for(Song song : listSong) {
            if(song.getYear() >= 1990 && song.getYear() < 2000) {
                song.toString();
            }
        }

        sc.close();

    }
}
