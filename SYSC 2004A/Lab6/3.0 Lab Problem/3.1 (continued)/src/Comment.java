//Ngo Huu Gia Bao
// 101163137

import java.util.Calendar;

public class Comment {

    private String author;
    private Calendar time;
    private String content;

    /**
     * The constructor for the Comment class
     * @param author String, the name of the author
     * @param content String, the content of the Post
     */
    public Comment (String author, String content) {
        this.author = author;
        this.content = content;
        this.time = Calendar.getInstance();
    }

    @Override
    /**
     * This method will return a formatted String for the Comment class
     */
    public String toString () {
        return "-> " + "'" + this.content + "'" + " - " + this.author + " ("
                + this.time.getTime() + ")"+"\n";

    }

}
