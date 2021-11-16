public class Printer {
  public static void main(String[] args) {
    new Thread(new AstPrinter()).start();
    new Thread(new EqPrinter()).start();
  }
}

class AstPrinter implements Runnable {
  @Override
  public void run() {
    while (true) {
      System.out.printf("***\n");
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
      }
    }
  }
}

class EqPrinter implements Runnable {
  @Override
  public void run() {
    while (true) {
      System.out.printf("=====\n");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
      }
    }
  }
}