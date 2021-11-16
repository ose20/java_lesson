import java.io.*;

public class Ex3 {
  public static void main(String[] args) {
    System.out.println("<!DOCTYPE html>");
    System.out.println("<html>");
    System.out.println("<head>");
    System.out.println("<title>My Page</title>");
    System.out.println("</head>");
    System.out.println("<body>");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      char box = '■';
      char circle = '●';
      String line;
      while((line = reader.readLine()) != null) {
        if(line.charAt(0) == box) {
          String contents = line.substring(1);
          System.out.printf("<h1>%s</h1>\n", contents);
        } else if(line.charAt(0) == circle) {
          String contents = line.substring(1);
          System.out.printf("<h2>%s</h1>\n", contents);
        } else {
          System.out.printf("<p>%s</p>", line);
        }
      }
    } catch (IOException e) {
      System.out.println(e);
    }

    System.out.println("</body>");
    System.out.println("</html>");
  }
}