// Ngo Huu Gia Bao
// 101163137

public class VideoPost extends Post{
    private boolean instantiated;

    /**
     * The constructor of Video Post
     * @param author String, the author name
     * @param link String, the content
     * @param instantiated boolean, if true, VIEWER DISCRETION ADVISED will be printed out
     */
    public VideoPost(String author,String link, boolean instantiated) {
        super(author, link);
        this.instantiated = instantiated;
    }

    @Override
    /**
     * The display method for Video Post, if the instantiated boolean variable
     * is true, VIEWER DISCRETION ADVISED will be printed out
     */
    public void display() {
        if (instantiated == true) {
            System.out.println("-VIEWER DISCRETION ADVISED-");
        }
        super.display();
    }

}
