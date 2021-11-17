public class TestMyArray {
  public static void main(String[] args) {
    MyStringArrayList ar = new MyStringArrayList();
    
    ar.add("alice");
    ar.add("bob");
    ar.printArray();
    System.out.println(ar.get(0));
    System.out.println(ar.get(1));
    ar.add("ose");
    ar.add("megane_anko");
    ar.add("w");
    ar.add("arknights");
    ar.printArray();
  }
}
