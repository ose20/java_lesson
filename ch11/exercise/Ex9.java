class Rectangle {
  final int INITIAL_WIDTH = 10;
  final int INITIAL_HEIGHT = 20;
  int width;
  int height;
  int x = 0;
  int y = 0;

  Rectangle() {
    setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
  }

  Rectangle(int width, int height) {
    setSize(width, height);
  }

  Rectangle(int x, int y, int width, int height) {
    setSize(width, height);
    setLocation(x, y);
  }

  void setLocation(int x, int y) {
    this.x = x; this.y = y;
  }

  void setSize(int width, int height) {
    this.width = width; this.height = height;
  }

  @Override
  public String toString() {
    return String.format("[%d, %d, %d, %d]", x, y, width, height);
  }

  Rectangle intersect(Rectangle other) {
    int sx = Math.max(this.x, other.x);
    int sy = Math.max(this.y, other.y);
    int ex = Math.min(this.x+this.width, other.x + other.width);
    int ey = Math.min(this.y+this.height, other.y + other.height);

    int newwidth = ex - sx;
    int newheight = ey - sy;
    if (newwidth > 0 && newheight > 0) {
      return new Rectangle(sx, sy, newwidth, newheight);
    } else {
      return null;
    }
  }

  public static void main(String[] args) {
    Rectangle a, b, c, d, e;
    a = new Rectangle(0, 0, 20, 10);
    b = new Rectangle(5, 5, 20, 10);
    c = new Rectangle(20, 10, 20, 10);
    d = new Rectangle(-10, -20, 100, 200);
    e = new Rectangle(21, 11, 20, 10);
    System.out.printf("a = %s\n", a);
    System.out.printf("b = %s\n", b);
    System.out.printf("c = %s\n", c);
    System.out.printf("d = %s\n", d);
    System.out.printf("e = %s\n", e);

    System.out.printf("a and a = %s\n", a.intersect(a));
    System.out.printf("a and b = %s\n", a.intersect(b));
    System.out.printf("a and c = %s\n", a.intersect(c));
    System.out.printf("a and d = %s\n", a.intersect(d));
    System.out.printf("a and e = %s\n", a.intersect(e));
  }

}