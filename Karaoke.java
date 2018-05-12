// clear && javac Karaoke.java && java Karaoke
import com.karaoke.model.Song;
import com.karaoke.model.SongBook;
import com.karaoke.KaraokeMachine;

public class Karaoke {
  public static void main(String[] args){
    
    SongBook songBook = new SongBook();
    KaraokeMachine machine = new KaraokeMachine(songBook);
    machine.run();
  }
}