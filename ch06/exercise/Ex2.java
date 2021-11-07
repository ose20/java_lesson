public class Ex2 {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      System.out.printf("%d:", i);
      for(int j=0; j<i*i; j++) {
        System.out.printf("*");
      }
      System.out.println("");
    }
  }
}