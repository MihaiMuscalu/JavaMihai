package mihai.at.OO.MusicBox;

import java.util.ArrayList;
import java.util.List;

public class MusicBox {
    private List<Record> records = new ArrayList<>();
    private int loadedRecord;
    private String color;
    private boolean found;

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

    public void searchRecord(String title)
    {
        found = false;
        for (int i=0; i <= 50 ; i++) {
            if (records.get(i).getRecordTitle() == title) {
                found = true;
                System.out.println(title + "was found");
            }
        }
        if (!found) System.out.println(title + "was not found");
    }

    public void loadRecord(Record record)
    {
        loadedRecord = record.getRecordID();
        System.out.println("Loaded " + record.getRecordTitle());
    }

    public void play(int num)
    {
        if (loadedRecord == -1)
        {
            System.out.println("No Record Loaded!");
            return;
        }
        System.out.println("Record Title: " + records.get(loadedRecord).getRecordTitle() + " Song Title: " + records.get(loadedRecord).getSongs().get(num).getTitle());
    }
}
