import java.io.*;

public class Kuku {
  public static final int MAX_QUESTION = 10;

  public static void main(String[] args) {
    int goodAnss = 0;
    System.out.println("これから九九の問題を" + MAX_QUESTION + "問出します．");

    for(int i=0; i<MAX_QUESTION; i++) {
      boolean ok = showQuestion(i+1);
      if(ok) { goodAnss++; }
    }

    final double rate = goodAnss * 100.0 / MAX_QUESTION;
    System.out.println("");
    System.out.println("問題数: " + MAX_QUESTION);
    System.out.println("正当数: " + goodAnss);
    System.out.println("不当数: " + (MAX_QUESTION - goodAnss));
    System.out.println("正答率: " + rate);
    System.out.println("");
    System.out.println("お疲れ様でした．");
  }

  public static boolean showQuestion(int qnum) {
    int x = (int)(Math.random() * 9) + 1;
    int y = (int)(Math.random() * 9) + 1;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.printf("[第%d問]  %d * %d = ?\n", qnum, x, y);
      String line = reader.readLine();
      int result = Integer.parseInt(line);
      if(x*y == result) {
        System.out.printf("正解!\n");
        return true;
      } else {
        System.out.printf("残念，不正解...\n");
        return false;
      }
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("入力が正しくありません．");
    }
    return false;
  }
}