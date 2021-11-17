//Ngo Huu Gia Bao
//101163137

public interface Post {

    /**
     * Abstract method for the react
     * @param r int, index of reactions array
     */
    public void react(int r);

    /**
     * Abstract method for addComment
     * @param cp Comment, the comment
     */
    public void addComment(Comment cp);

    /**
     * Abstract method for the display
     */
    public void display();

    /**
     * Abstract method for the get content
     */
    public String getContent();

    /**
     * Abstract method for the author
     */
    public String getAuthor();

    /**
     * Abstract method for the time
     */
    public String getTime();



}
