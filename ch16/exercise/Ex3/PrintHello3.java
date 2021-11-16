class LabelPrinter extends Thread {
  String label = "no label";
  LabelPrinter(String label) {
    this.label = label;
  }

  @Override
  public void run() {
    int cnt = 0;
    while (true) {
      System.out.println(cnt + ": " + label);
      cnt++;
      try {
        Thread.sleep(1500);
      } catch (InterruptedException e) {
        System.out.println(e);
        System.exit(-1);   
      }
    }
  }
}

class PrintHello3 {
  public static void main(String[] args) {
    LabelPrinter th1 = new LabelPrinter("おはよう！");
    LabelPrinter th2 = new LabelPrinter("こんにちは!");
    LabelPrinter th3 = new LabelPrinter("こんばんは!");
    th1.start();
    th2.start();
    th3.start();
  }
}