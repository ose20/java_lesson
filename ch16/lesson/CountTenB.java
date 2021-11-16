public class CountTenB implements Runnable {
  public static void main(String[] args) {
    CountTenB ct = new CountTenB();
    Thread th = new Thread(ct);
    th.start();
    for (int i=0; i<30; i++) {
      System.out.printf("main:i = %d\n", i);
    }
  }

  @Override
  public void run() {
    for (int i=0; i<30; i++) {
      System.out.printf("run:i = %d\n", i);
    }
  }
}