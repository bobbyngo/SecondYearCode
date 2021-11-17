public class Main {
   public static void main(String[] args) {
      MessagePost mp = new MessagePost("Chris Mascarolls", "Deck the halls.");

      for (int i = 0; i < 32; i++) {
         mp.react(0);
      }
      for (int i = 0; i < 13; i++) {
         mp.react(1);
      }
      mp.react(2);

      mp.addComment(new Comment("Wanda Nauwittol", "What are your plans?!"));
      mp.addComment(new Comment("Jude Alkingtomie", "Yay!"));
      mp.addComment(new Comment("Grinch Grinch", "Nope!"));

      VideoPost vp = new VideoPost("Grinch Grinch", "This bumps! https://www.youtube.com/watch?v=GAs67cRfmQI&ab_channel=Tyler%2CTheCreator-Topic", true);
      for (int i = 0; i < 13; i++) {
         vp.react(1);
      }
      vp.react(0);

      PollPost pp = new PollPost("Wanda Nauwittol", "What's everyone doing for Christmas Break!?");
      pp.react("Eat!");
      pp.react("Eat!");
      pp.react("Eat");
      pp.react("Celebrate");
      pp.react("Not study!");
      pp.react("Not study!");
      pp.react("Not study!");
      pp.react("Celebrate");

      for (int i = 0; i < 5; i++) {
         pp.react(0);
      }
      for (int i = 0; i < 3; i++) {
         pp.react(1);
      }
      pp.react(2);

      pp.addComment(new Comment("Jude Alkingtomie", "Yes."));
      pp.addComment(new Comment("Grinch Grinch", "Nothing... >:)"));

      PostWall pw = new PostWall();
      pw.addPost(mp);
      pw.addPost(vp);
      pw.addPost(pp);
      pw.generate();
   }
}
