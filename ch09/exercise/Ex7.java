public class Ex7 {
  public static void main(String[] args) {
    int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
    int max_data = data[0];
    for (int d : data) {
      if (d > max_data) max_data = d;
    }

    System.out.printf("最大値は %d です．\n", max_data);
  }
}