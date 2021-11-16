import java.io.*;

public class Find1 {
  public static void main(String[] args) {
    if(args.length != 1) {
      System.out.println("Usage: java Find1 searching-string < searching-file");
      System.out.println("Example: java Find1 System < Find1.java");
      System.exit(0);
    }
    String findstr = args[0];
    System.out.println("検索文字列は「" + findstr + "」です．");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      String line;
      int linenum = 1;
      while ((line = reader.readLine()) != null) {
        int n = line.indexOf(findstr);
        if(n >= 0) {
          System.out.println(linenum + ": " + line);
        }
        linenum++;
      } 
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}