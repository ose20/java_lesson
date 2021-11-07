public class Ex1 {
  public static void main(String[] args) {
    if(100) { // <- これはちゃんとエラーになる．ありがたい
      System.out.printf("true\n");
    } else {
      System.out.printf("false\n");
    }
  }
}