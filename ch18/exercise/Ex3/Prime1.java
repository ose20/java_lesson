import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.*;

public class Prime1 {
  public static void main(String[] args) throws IOException {
    if (args.length != 1) {
      System.out.println("使用法: java Prime1 作成ファイル");
      System.out.println("例: java Prime1 prime.txt");
      System.exit(0);
    }
    String filename = args[0];

    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
    writePrime(writer);
    writer.close();
  }

  public static void writePrime(PrintWriter writer) {
    final int MAX_PRIME = 1000;
    boolean[] prime = new boolean[MAX_PRIME];
    for (int i=0; i<MAX_PRIME; i++) prime[i] = true;
    prime[0] = false;
    prime[1] = false;
    for (int i=0; i<MAX_PRIME; i++) {
      if (prime[i]) {
        writer.println(i);
        for (int n=2; i*n<MAX_PRIME; n++) prime[i*n] = false;
      }
    }
  }
}
