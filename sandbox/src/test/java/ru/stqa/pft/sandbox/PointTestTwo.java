package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTestTwo {

  @Test
  public void testDistance() {
    Point p1 = new Point(5, 5);
    Point p2 = new Point(5, 15);
    Assert.assertEquals(p1.distance(p2), 10);
  }

  @Test
  public void testDistanceTwo() {
    Point p1 = new Point(-4, 10);
    Point p2 = new Point(0, 13);
    Assert.assertEquals(p1.distance(p2), 5);
  }
}
