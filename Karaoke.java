// clear && javac Karaoke.java && java Karaoke
import com.karaoke.model.Song;
import com.karaoke.model.SongBook;

public class Karaoke {
  public static void main(String[] args){
    Song song = new Song(
      "Micheal Jackson",
      "Beat It",
      "https://www.youtube.com"
    );
    SongBook songBook = new SongBook();
    System.out.printf("Adding %s %n", song);
    songBook.addSong(song);
    System.out.printf("There are %d songs. %n", songBook.getSongCount());
  }
}