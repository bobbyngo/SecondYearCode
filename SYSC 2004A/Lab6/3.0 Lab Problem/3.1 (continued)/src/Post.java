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

    /**
     * The constructor of Post
     * @param author String, the name of author
     * @param content String, the content of the post
     */
    public Post (String author, String content) {
        this.author = author;
        this.time = Calendar.getInstance();
        this.content = content;
        this.reactions = new int[4];
        this.comments = new ArrayList<>();
    }

    /**
     * The method will do the increment when the specific index contain in the array is called.
     * @param index int, the index of the array size 4
     */
    public void react (int index) {
        reactions[index]++;
    }

    /**
     * This method will add the new comment with the type Comment into the ArrayList
     * @param newComment ArrayList, comment that the user make
     */
    public void addComment (Comment newComment) {
        comments.add(newComment);
    }

    /**
     * The display method for the Post class. It will print out the format author-time-content
     * 4 reactions with total number of them- comments
     */
    public void display() {

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

    /**
     * The get method for the ArrayList comment
     * @return comments ArrayList type Comment
     */
   public ArrayList<Comment> getComments() {
        return comments;
    }

    /**
     * The method to get the time
     * @return time, the time variable type Calendar
     */
    public Calendar getTime() {
        return time;
    }

    /**
     * The method to get the name of the author
     * @return author, String
     */
    public String getAuthor() {
        return author;
    }

    /**
     * The method to get the content
     * @return content type String
     */
    public String getContent() {
        return content;
    }

    /**
     * The method to get the array of int which has size 4
     * @return reactions, array type int
     */
    public int[] getReactions() {
        return reactions;
    }
}
