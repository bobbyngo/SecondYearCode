//Ngo Huu Gia Bao
//101163137

import java.util.ArrayList;

public class PostWall {

    private ArrayList<Post> postList = new ArrayList<>();

    /**
     * This method calls each Post's display() method.
     * Posts should be separated by a divider.
     */
    public void generate(){
        for (Post p: postList){
            p.display();

            for (int i = 0; i < 40; i++) {
                System.out.print("-");
            }
            System.out.println("\n");
        }
    }

    /**
     * This method must take a Post object and add it to the PostWall's list of Posts.
     * It can be any of the above Post subtypes (VideoPost, MessagePost, PollPost)
     * @param post Post, the variable type post
     */
    public void addPost(Post post) {
        postList.add(post);
    }
}
