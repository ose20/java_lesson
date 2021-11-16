public class Printer {
  public static void main(String[] args) {
    new PrinterA().start();
    new PrinterB().start();
  }
}

class PrinterA extends Thread {
  @Override
  public void run() {
    while (true) {
      System.out.printf("***\n");
      try { Thread.sleep(3000); } catch (InterruptedException e) {}
    }
  }
}

class PrinterB extends Thread {
  @Override
  public void run() {
    while (true) {
      System.out.printf("=====\n");
      try { Thread.sleep(5000); } catch (InterruptedException e) {}
    }
  }

}