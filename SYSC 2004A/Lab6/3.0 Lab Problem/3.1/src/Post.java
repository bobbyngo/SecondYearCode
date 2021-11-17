// Ngo Huu Gia Bao
// 101163137

import java.util.ArrayList;
import java.util.Calendar;


public class Post {

    private String author;
    private Calendar time;
    private String content;
    private int[] reactions ;
    private ArrayList<Comment> comments;

    public Post (String author, String content) {
        this.author = author;
        this.time = Calendar.getInstance();
        this.content = content;
        this.reactions = new int[4];
        this.comments = new ArrayList<>();
    }

    public void react (int index) {
        reactions[index]++;
    }

    public void addComment (Comment newComment) {
        comments.add(newComment);
    }


    public void display() {

        /*TODO*/
        String p = "";
        for (Comment i: comments) {
            p += i.toString();
        }

        String s = String.format(
                "%s on (%s):\n" +
                        "'%s'\n" +
                        "=)(%d) =|(%d) =((%d) =O(%d)\n" +
                        "Comments:\n" +
                        "%s"
                , this.author, this.time.getTime(), this.content, this.reactions[0],
                this.reactions[1], this.reactions[2], this.reactions[3], p); // add the required values here

        System.out.println(s);
    }

/*    public ArrayList<Comment> getComments() {
        return comments;
    }

    public Calendar getTime() {
        return time;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public int[] getReactions() {
        return reactions;
    }*/
}
