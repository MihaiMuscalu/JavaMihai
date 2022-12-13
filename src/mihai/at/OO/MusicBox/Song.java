package mihai.at.OO.MusicBox;

public class Song {
    private int time;
    private String Title;

    public Song(int time, String title) {
        this.time = time;
        Title = title;
    }

    public int getTime() {
        return time;
    }

    public String getTitle() {
        return Title;
    }
}
