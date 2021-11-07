import java.io.*;

public class Ex3 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    try {
      System.out.printf("現在の時刻（「時」のみ）を0~23の範囲で入力してください．\n");
      String line = reader.readLine();
      int h = Integer.parseInt(line);
      if(h<0 || 23<h) {
        System.out.printf("入力は0~23の範囲でしてください．\n");
      } else if (h<=11) {
        System.out.printf("午前中\n");
      } else if (h==12) {
        System.out.printf("正午\n");
      } else if (h<=18) {
        System.out.printf("午後\n");
      } else {
        System.out.printf("夜\n");
      }
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("入力は0~23の整数でお願いします．");
    } 
  }
}