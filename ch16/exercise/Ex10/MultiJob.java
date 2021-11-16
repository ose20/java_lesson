public class MultiJob {
  public static void main(String[] args) {
    for (int i=0; i<10; i++) {
      new JobThread(i).start();
    }
  }
}

class JobThread extends Thread {
  Job job = null;
  JobThread(int n) {
    job = new Job(n);
  }

  @Override
  public void run() {
    while (true) {
      job.work();
    }
  }
}

class Job {
  private int num;
  private int cnt = 0;
  public Job(int n) {
    num = n;
  }
  public void work() {
    System.out.println(this + " is working." + " count is " + cnt);
    try {
      cnt++;
      int n = (int)(Math.random() * 10000);
      Thread.sleep(n);
    } catch (InterruptedException e) {}
  }

  @Override
  public String toString() {
    return "[Job " + num + "]";
  }
}