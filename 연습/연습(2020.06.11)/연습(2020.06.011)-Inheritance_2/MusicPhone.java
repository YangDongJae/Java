
/**
 * Write a description of class MusicPhone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicPhone extends MobilePhone
{

    public MusicPhone(){
    }

    public void downloadMusic(String musicName){
        System.out.println("now downloading" + musicName);
    }

    public void playMusci(String musicName){
        System.out.println("playing" + musicName);
    }
}
