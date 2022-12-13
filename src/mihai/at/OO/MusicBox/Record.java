package mihai.at.OO.MusicBox;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private List<Song> songs = new ArrayList<>();
    private String recordTitle;
    private int recordID;

    public Record(List<Song> songs, String recordTitle) {
        this.songs = songs;
        this.recordTitle = recordTitle;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }
}
