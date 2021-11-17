public class Main {
   public static void main(String[] args) {

/*      // MessagePost

     MessagePost p = new MessagePost("Chris Mascarolls", "Deck the halls.");

      for (int i = 0; i < 32; i++) {
         p.react(0);
      }

      for (int i = 0; i < 13; i++) {
         p.react(1);
      }

      p.react(2);

      p.addComment(new Comment("Wanda Nauwittol", "What are your plans?!"));
      p.addComment(new Comment("Jude Alkingtomie", "Yay!"));
      p.addComment(new Comment("Grinch Grinch", "Nope!"));

      // VideoPost
      VideoPost a = new VideoPost("Grinch Grinch", "This bumps! " +
              "https://www.youtube.com/watch?v=GAs67cRfmQI&ab_channel=Tyler%2CTheCreator-Topic", true);

      a.react(0);

      for (int i = 0; i < 13; i++) {
         a.react(1);
      }

      a.addComment(new Comment("Bobby Ngo", "I better not get rickrolled by this link"));
      a.addComment(new Comment("Ethan Leir", "Cool clip"));
      a.addComment(new Comment("Zakaria Ismail", "Wow, interesting"));

      //PollPost
      PollPost b = new PollPost("Wanda Nauwittol", "What's everyone doing for Christmas Break!?");

      b.react("Eat!");
      b.react("Eat!");
      b.react("Eat");
      b.react("Celebrate");
      b.react("Celebrate");

      for(int i = 0; i < 3; i++){
         b.react("Not Study!");
      }

      for (int i = 0; i < 5; i++) {
         b.react(0);
      }

      for (int i = 0; i < 3; i++) {
         b.react(1);
      }

      b.react(2);

      b.addComment(new Comment("Jude Alkingtomie", "Yes."));
      b.addComment(new Comment("Grinch Grinch", "Nothing... >:)"));

      //PostWall
      PostWall wall = new PostWall();
      wall.addPost(p);
      wall.addPost(a);
      wall.addPost(b);
      wall.generate();*/




      //Comment
      Post p = new Post("Chris Mascarolls", "Deck the halls.");

      for (int i = 0; i < 32; i++) {
         p.react(0);
      }

      for (int i = 0; i < 13; i++) {
         p.react(1);
      }

      p.react(2);

      p.addComment(new Comment("Wanda Nauwittol", "What are your plans?!"));
      p.addComment(new Comment("Jude Alkingtomie", "Yay!"));
      p.addComment(new Comment("Grinch Grinch", "Nope!"));


      //Video Post
      VideoPost vp = new VideoPost("Grinch Grinch",
              "'This bumps! https://www.youtube.com/watch?v=GAs67cRfmQI&ab_channel=Tyler%2CTheCreator-Topic",
              true);
      vp.react(0);

      for (int i = 0; i < 13; i++) {
         vp.react(1);
      }

      //PollPost
      PollPost pp = new PollPost("Wanda Nauwittol"
                                 , "'What's everyone doing for Christmas Break!?'");

      pp.react("Eat!");
      pp.react("Eat!");
      pp.react("Eat");
      pp.react("Celebrate");
      pp.react("Celebrate");
      pp.react("Study");
      pp.react("Study");
      pp.react("Study");

      for (int i = 0; i < 5; i++) {
         pp.react(0);
      }

      for (int i = 0; i < 3; i++) {
         pp.react(1);
      }

      pp.react(2);

      pp.addComment(new Comment("Jude Alkingtomie", "Yes."));
      pp.addComment(new Comment("Grinch Grinch", "Nothing... >:)"));

      //PostWall
      PostWall pw = new PostWall();
      pw.addPost(p);
      pw.addPost(vp);
      pw.addPost(pp);
      pw.generate();

   }
}