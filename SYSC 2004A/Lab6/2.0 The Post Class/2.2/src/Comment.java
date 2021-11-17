//Ngo Huu Gia Bao
// 101163137

import java.util.ArrayList;
import java.util.Calendar;


public class Comment {
    private String author;
    private Calendar time;
    private String content;

    public Comment () {
    }

    public Comment (String author, String content) {
        this.author = author;
        this.content = content;
        this.time = Calendar.getInstance();
    }

    @Override
    public String toString () {
        return "-> " + "'" + this.content + "'" + " - " + this.author + " ("
                + this.time.getTime() + ")"+"\n";

    }

    public String getAuthor() {
        return author;
    }

    public Calendar getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }
}
