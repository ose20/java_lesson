class PlacedRectangle extends Rectangle {
  int x, y;
  PlacedRectangle () {
    super();
    setLocation(0, 0);
  }
  PlacedRectangle (int x, int y) {
    super();
    setLocation(x, y);
  }
  PlacedRectangle (int x, int y, int width, int height) {
    super(width, height);
    setLocation(x, y);
  }
  void setLocation (int x, int y) {
    this.x = x; this.y = y;
  }
  @Override
  public String toString() {
    return String.format("[ (%d, %d) [%d, %d] ]", x, y, width, height);
  }
}