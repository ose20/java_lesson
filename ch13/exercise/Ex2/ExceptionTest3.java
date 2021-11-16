public class ExceptionTest3 {
  public static void main(String[] args) {
    int[] myarray = new int[3];
    myAssgin(myarray, 100, 0);
  }

  static void myAssgin(int[] arr, int index, int value) {
    try {
      arr[index] = value;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("例外は" + e + "です");
    }
  }
}