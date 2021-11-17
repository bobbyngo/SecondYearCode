// Ngo Huu Gia Bao
// 101163137

import java.util.HashMap;

public class PollPost extends Post {

    private HashMap<String, Integer> newReact = new HashMap<>(); //String, Int

    /**
     * The constructor PollPost
     * @param author String, the author name
     * @param content String, the content
     */
    public PollPost(String author, String content) {
        super(author, content);

    }

    /**
     * This method will check if the user's input String exist.
     * If yes, it will increment by 1, if not it will be add to the Hashmap
     * @param reaction String, user can enter any new reaction
     */
    public void react (String reaction) {
        int count = 1;
        if (newReact.containsKey(reaction)) {
            count += newReact.get(reaction);
            newReact.put(reaction,count);
        }else {
            newReact.put(reaction, 1);
        }
    }

    @Override
    /**
     * The display method for PollPost class
     * This method should display with the emoji counters, but users can also submit a String answer.
     * These will typically be a single word and can be anything.
     */
    public void display() {

        String p = "";
        for (Comment i: getComments()) {
            p += i.toString();
        }

        String newEmo = "";
        for (String i: newReact.keySet()) {
            newEmo += i + "  (" + newReact.get(i) + ") \n" ;
        }

        String s = String.format(
                "%s on (%s):\n" +
                        "'%s'\n" +
                        "%s \n " +
                        "=)(%d) =|(%d) =((%d) =O(%d)\n" +
                        "Comments:\n" +
                        "%s"
                , this.getAuthor(), this.getTime().getTime(), this.getContent(),
                newEmo
                , this.getReactions()[0], this.getReactions()[1], this.getReactions()[2],
                this.getReactions()[3], p); // add the required values here

        System.out.println(s);
    }

}
