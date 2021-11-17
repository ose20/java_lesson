public class MyStringArrayList {
  private static final int INITIAL_CAPACITY = 4;
  private String[] ar;
  private int sz;

  public MyStringArrayList() {
    ar = new String[INITIAL_CAPACITY];
    sz = 0;
  }

  public void add(String s) {
    if (ar.length <= sz) {
      String[] newar = new String[sz * 2];
      for (int i=0; i<ar.length; i++) newar[i] = ar[i];
      newar[sz] = s;
      sz++;
      ar = newar;
    } else {
      ar[sz] = s;
      sz++;
    }
  }

  public String get(int i) {
    if (i < 0 || sz <= i) {
      throw new IndexOutOfBoundsException();
    } else {
      return ar[i];
    }
  }

  public void printArray() {
    System.out.printf("[");
    for (int i=0; i<sz; i++) {
      if (i>0) System.out.printf(", ");
      System.out.printf("%s", ar[i]);
    }
    System.out.println("]");
  }

  public int size() { return sz; }
}
