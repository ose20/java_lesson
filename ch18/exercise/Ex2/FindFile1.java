import java.io.*;

public class FindFile1 {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("使用法: java FindFile1 検索文字列 検索対象ファイル");
      System.out.println("例: java FindFile1 System FindFile1.java");
      System.exit(0);
    }
    String filename = args[1];
    String searchString = args[0];
    try {
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      String line;
      int linenum = 1;
      while ((line = reader.readLine()) != null) {
        int n = line.indexOf(searchString);
        if (n >= 0) {
          System.out.printf("%d:%s\n", linenum, line);
        }
        linenum++;
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println(filename + "が見つかりません．");
    } catch (IOException e) {
      System.out.println(e);;
    }
  }
}