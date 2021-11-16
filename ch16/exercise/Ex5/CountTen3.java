public class CountTen3 extends Thread {
  public static void main(String[] args) {
    for (int i=0; i<3; i++) {
      new CountTen3().start();
    }

    for (int i=0; i<20; i++) {
      System.out.println(Thread.currentThread().getName() + ": " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {        
      }
    }
  }

  @Override
  public void run() {
    for (int i=0; i<20; i++) {
      System.out.println(Thread.currentThread().getName() + ": " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }
}