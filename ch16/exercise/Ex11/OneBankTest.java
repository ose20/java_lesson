public class OneBankTest extends Thread{
  public static void main(String[] args) {
    new OneBankTest().start();
    new OneBankTest().start();
  }

  @Override
  public void run() {
    while (true) {
      OneBank.addMoney(100);
      OneBank.addMoney(-100);
    }
  }
}


class OneBank {
  static private int value = 0;
  public static synchronized void addMoney(int money) {
    int currentValue = value;
    System.out.println(Thread.currentThread() + "が addMoney に入りました．");
    value += money;
    if (currentValue + money != value) {
      System.out.println(Thread.currentThread() + "で問題が発生しました!!!!!");
      System.exit(-1);
    }

    System.out.println(Thread.currentThread() + "が addMoney から出ました．");
  }
}