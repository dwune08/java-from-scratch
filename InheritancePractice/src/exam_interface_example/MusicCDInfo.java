package exam_interface_example;

public class MusicCDInfo extends CDInfo{
    private String artist;
    private String[] songTitle;

    public MusicCDInfo(String registerNo, String title, String artist, String[] songTitle) {
        super(registerNo, title);
        this.artist = artist;
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String[] getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String[] songTitle) {
        this.songTitle = songTitle;
    }

    public String showCDInfo() {

        return artist + " "+super.getTitle() + songTitle +  "음반.";
    }
}
