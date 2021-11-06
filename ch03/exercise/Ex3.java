import java.io.*;

public class Ex3 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.println("文字列を入力してください．");
      String line = reader.readLine();
      for(int i=0; i<line.length(); i++) {
        char c = line.charAt(i);
        int unicode = c;
        System.out.printf("'%c'の文字コードは%dです．\n", c, unicode);
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}