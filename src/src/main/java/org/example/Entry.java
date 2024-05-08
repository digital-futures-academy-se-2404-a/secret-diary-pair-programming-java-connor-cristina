package org.example;

import java.util.Date;

public class Entry {

    private String contents;
    private Date entryDate;

    public Entry(String content, Date date) {
        this.contents = content;
        if (content == null){ this.contents = "";}
        this.entryDate = date;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
