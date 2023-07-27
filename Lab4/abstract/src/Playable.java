interface Playable{
    public void playMusic();
    public void stopMusic();
}
class MP3Player implements Playable{
    public  void PlayMusic(){ System.out.println("mp3 play");}

    @Override
    public void playMusic() {

    }

    public void stopMusic(){ System.out.println("mp3 stop");}
}
class CDplayer implements Playable{
    public void PlayMusic(){ System.out.println("cd play");}

    @Override
    public void playMusic() {

    }

    public void stopMusic(){ System.out.println("cd stop");}
}
public class Playable {
    public static void main(String[]args){
        MP3Player mp=new MP3Player();
        mp.PlayMusic();
        mp.stopMusic();
        CDplayer cd=new CDplayer();
        cd.PlayMusic();
    }
}