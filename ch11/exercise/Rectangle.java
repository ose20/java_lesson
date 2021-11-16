public class Rectangle {
  int width;
  int height;

  Rectangle(int height, int width) {
    this.height = height; this.width = width;
    System.out.println(this);
  }

  boolean areSame(Rectangle other) {
    return (height == other.height && width == other.width);
  }

  @Override
  public String toString() {
    return "[height: " + height + ", width: " + width + "]";
  }

  public static void main(String[] args) {
    Rectangle a = new Rectangle(20, 30);
    Rectangle b = new Rectangle(20, 30);
    Rectangle c = new Rectangle(30, 20);

    System.out.println(a.areSame(b));
    System.out.println(b.areSame(c));
  }
}