public class StudentTest {
  public static void main(String[] args) {
    Student[] data = {
      new Student("今永昇太", 65, 90, 100),
      new Student("入江大生", 82, 73, 64),
      new Student("大貫晋一", 74, 31, 42),
      new Student("牧秀悟", 100, 95, 99),
    };

    for (int i=0; i<data.length; i++) {
      System.out.println(data[i] + "\t-> " + data[i].total());
    }
  }
}