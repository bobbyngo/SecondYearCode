//Ngo Huu Gia Bao
//101163137


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PollPost implements Post {

    private final String author;
    private final String content;
    private final List<Comment> comments = new ArrayList<>();
    private final int[] reactions = new int[4];
    private final String time = Calendar.getInstance().getTime().toString();
    private final List<StringIntPair> pollAnswers = new ArrayList<>();


    /**
     * The constructor for the PollPost
     * @param author
     * @param content
     */
    public PollPost(String author, String content) {
        this.author = author;
        this.content = content;
    }

    /**
     * This method will increment the given index in the reactions array
     * @param r ,int the index of the array
     */
    @Override
    public void react(int r) {
        reactions[r]++;
    }

    /**
     * This method will allow the customer to custom there reaction
     * @param s String
     */
    public void react(String s) {
        for (int i = 0; i < pollAnswers.size(); i++) {
            StringIntPair pair = pollAnswers.get(i);
            if (s.equals(pair.s)) {
                pollAnswers.set(i, new StringIntPair(s, pair.i + 1));
                return;
            }
        }
        pollAnswers.add(new StringIntPair(s, 1));
    }

    /**
     * This method will add a comment (type Comment) to the comments List
     * @param cp Comment
     */
    public void addComment(Comment cp) {
        comments.add(cp);
    }

    /**
     * Display method for PollPost class
     */
    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        for (StringIntPair pair : pollAnswers) {
            sb.append(pair.s).append(" (").append(pair.i).append(")\n");
        }
        display(sb.toString());

    }

    /**
     * This method will display the information of the Comment such as the author, time, content,
     * number of reactions that the comment have
     * @param customContent String
     */
    private void display(String customContent) {
        StringBuilder sb = new StringBuilder();
        for (Comment c : comments) {
            sb.append("-> ")
                    .append(c.getDisplay())
                    .append("\n");
        }

        String s = String.format(
                "%s on (%s):\n" +
                        "'%s'\n" +
                        "%s" +
                        "\uD83D\uDE00(%d) \uD83D\uDE43(%d) \uD83D\uDE12(%d) \uD83D\uDE2F(%d)\n" +
                        "Comments:\n" +
                        "%s",
                author, time, content, customContent,
                reactions[0], reactions[1], reactions[2], reactions[3], sb.toString()
        );
        System.out.println(s);
    }

    /**
     * Get method for the content
     * @return String, content
     */
    @Override
    public String getContent() {
        return content;
    }

    /**
     * Get method for the author
     * @return String, author
     */
    @Override
    public String getAuthor() {
        return author;
    }

    /**
     * Get method for the time
     * @return String, time
     */
    @Override
    public String getTime() {
        return time;
    }


}
