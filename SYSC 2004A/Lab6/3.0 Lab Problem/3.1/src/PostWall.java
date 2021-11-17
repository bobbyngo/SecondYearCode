//Ngo Huu Gia Bao
//101163137

import java.util.ArrayList;

public class PostWall {

    ArrayList<Post> postList = new ArrayList<>();

    public void generate(){
        for (Post p: postList){
            p.display();
        }

        for (int i = 0; i < 30; i++) {
            System.out.println("/");
        }
    }

    public void addPost(Post post) {
        postList.add(post);
    }
}
