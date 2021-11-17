//Ngo Huu Gia Bao
//101163137


import java.util.ArrayList;
import java.util.List;

public class PostWall {
    private final List<Post> wall = new ArrayList<>();


    /**
     * This method will generate different sections for different posts
     */
    public void generate() {
        StringBuilder sb = new StringBuilder();
        for (Post p : wall) {
            p.display();
            System.out.println("--------------------------------------------------");
        }
    }

    /**
     * This method will add the post to the wall List
     * @param p Post
     */
    public void addPost(Post p) {
        wall.add(p);
    }
}
