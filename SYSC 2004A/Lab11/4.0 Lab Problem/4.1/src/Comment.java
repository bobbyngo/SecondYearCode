import java.util.Calendar;

public class Comment {

    private final String author;
    private final String content;
    private final String time = Calendar.getInstance().getTime().toString();

    public Comment(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getDisplay() {
        return "'" + content + "' - " + author + " (" + time + ")";
    }
}
