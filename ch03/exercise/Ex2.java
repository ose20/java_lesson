import java.io.*;

public class Ex2 {
  public static final int MAX_Q = 2;

  public static void main(String[] args) {
    int age = 0;
    for(int i=0; i<MAX_Q; i++) {
      age += getAge(i+1);
    }

    double ave = age / 2.0;
    System.out.printf("2人の平均年齢は%f歳です．\n", ave);
  }

  public static int getAge(int i) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.printf("%d人目のお名前を教えてください．\n", i);
      String line = reader.readLine();
      System.out.printf("%sさんの年齢を教えてください．\n", line);
      line = reader.readLine();
      int age = Integer.parseInt(line);
      return age;
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("入力が正しくありません．");
    }

    return 0;
  }
}