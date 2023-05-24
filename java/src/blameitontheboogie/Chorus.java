package blameitontheboogie;

public class Chorus {
   public static void main(String[] args) {
      String chorus = "Don't blame it on the sunshine" + "\n" + "Don't blame it on the moonlight" + "\n"
            + "Don't blame it on the good times" + "\n" + "Blame it on the boogie";
      singChorus(chorus, 2);
   } 

   public static void singChorus(String chorus, int times) {
      System.out.println(chorus);
      int i = 0;
      while (i < times) {
         System.out.println(chorus);
         i++;
      }
   }
}

