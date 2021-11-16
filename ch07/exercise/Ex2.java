public class Ex2 {
  public static void main(String[] args) {
    int i=0;
    int j;
    while(i < 10) {
      j=0;
      while(j < i*i) {
        System.out.print("*");
        j++;
      }
      System.out.println("");
      i++;
    }
  }
}