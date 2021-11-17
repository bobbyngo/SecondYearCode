import java.util.ArrayList;
import java.util.Calendar;

// Ngo Huu Gia Bao
// 101163137

public class Post {
    private String author;
    private Calendar time;
    private String content;
    private String[] reactions = {"=)", "=|", "=(", "=O"};
    private ArrayList<String> comments;

    public Post (String author, String content) {
        this.author = author;
        this.time = Calendar.getInstance();
        this.content = content;
/*        this.reactions;
        this.content = null;*/
        this.comments = new ArrayList<>();

    }
}
