package test.by.gaponenko.sphere.factory;

import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.factory.PointFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PointFactoryTest {
    PointFactory pointFactory;
    Point actual;
    Point expected1;
    Point expected2;

    @BeforeClass
    void setUp() {
        expected1 = new Point(0, 0, 0);
        pointFactory = new PointFactory();
    }

    @Test
    void createPositiveTest() {
        actual = pointFactory.create(0, 0, 0);
        Assert.assertEquals(actual, expected1);
    }

    @Test
    void createNegativeTest() {
        actual = pointFactory.create(1, 2, 3);
        Assert.assertNotEquals(actual, expected2);
    }

    @AfterClass
    void tearDown() {
        pointFactory = null;
        actual = null;
        expected1 = null;
        expected2 = null;
    }
}
