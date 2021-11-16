public class Ex8 {
  public static void main(String[] args) {
    int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
    System.out.println("並べ替える前");
    printArray(data);
    sort(data);
    System.out.println("並べ替えた後");
    printArray(data);
  }

  private static void printArray(int[] ds) {
    for (int d : ds) {
      System.out.printf("%d ", d);
    }
    System.out.println("");
  }

  private static void sort(int[] ds) {
    for (int i=0; i<ds.length; i++) {
      for (int j=i+1; j<ds.length; j++) {
        if (ds[j] < ds[i]) {
          int tmp = ds[j];
          ds[j] = ds[i];
          ds[i] = tmp;
        }
      }
    }
  }
}