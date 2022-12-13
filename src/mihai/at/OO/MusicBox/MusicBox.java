package mihai.at.OO.MusicBox;

import java.util.ArrayList;
import java.util.List;

public class MusicBox {
    private List<Record> records = new ArrayList<>();
    private String color;

    public MusicBox( String color) {
        this.color = color;
    }

    public List<Record> getRecords() {
        return records;
    }

    public String getColor() {
        return color;
    }

    public void addRecord(Record record)
    {
        if(records.size() >= 50) {
            System.out.println("No more space. Please take out a record!");
            return;
        }
        records.add(record);
    }

    public void removeRecord(Record record)
    {
        records.remove(record);
    }

    public void getRecordNames()
    {
        for (Record record: records) {
            System.out.println(record.getRecordTitle());
        }
    }
    public void getSumOfMusic()
    {
        int sumTime = 0;
        for (Record record: records) {
            for (Song song: record.getSongs()) {
               sumTime += song.getTime();
            }
        }

        System.out.println("There are " + sumTime + " minutes of songtime in the player");
    }
}
