import java.io.*;

public class Ex7 {
  public static void main(String[] args) {
    System.out.println("0~6の数字を入力してください．対応した曜日を表示します．");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      String line = reader.readLine();
      int n = Integer.parseInt(line);

      switch(n) {
        case 0:
          put("日曜日");
          break;
        case 1:
          put("月曜日");
          break;
        case 2:
          put("火曜日");
          break;
        case 3:
          put("水曜日");
          break;
        case 4:
          put("木曜日");
          break;
        case 5:
          put("金曜日");
          break;
        case 6:
          put("土曜日");
          break;
        default:
          put("0~6の範囲内で入力してください．");
          break;
      }
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      put("数字を入力してください．");
    }
  }

  public static void put(String s) {
    System.out.println(s);
  }
}