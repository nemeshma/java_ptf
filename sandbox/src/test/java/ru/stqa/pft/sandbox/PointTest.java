package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistance() {
    Point p1 = new Point(-4, 10);
    Point p2 = new Point(0, 13);
    Assert.assertEquals(p1.distance(p2), 5);
  }
}
