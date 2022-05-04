package ru.stqa.pft.sandbox;

public class ClassDistanceBetweenPoints {
  public static void main(String[] args) {
    Point p1 = new Point(5, 5);
    Point p2 = new Point(5, 15);

    System.out.println("Расстояния между двумя точками (" + p1.x + ";" + p2.x + ") и  (" + p2.x + ";" + p2.y + ") = " + p1.distance(p2));
  }
}

