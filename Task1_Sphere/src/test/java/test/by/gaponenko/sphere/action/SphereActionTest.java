package test.by.gaponenko.sphere.action;

import by.gaponenko.sphere.action.SphereAction;
import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.entity.Sphere;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SphereActionTest {
    SphereAction sphereAction;
    Sphere sphere;

    @BeforeClass
    public void setUp() {
        sphereAction = new SphereAction();
        sphere = new Sphere(1, new Point(0, 0, 0), 1.0);
    }

    @Test
    public void volumePositiveTest() {
        double actual = sphereAction.volume(sphere);
        double expected = 4.188;
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void volumeNegativeTest() {
        double actual = sphereAction.volume(sphere);
        double expected = 5.188;
        Assert.assertNotEquals(actual, expected, 0.001);
    }

    @Test
    public void squarePositiveTest() {
        double actual = sphereAction.square(sphere);
        double expected = 12.566;
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void squareNegativeTest() {
        double actual = sphereAction.square(sphere);
        double expected = 13.566;
        Assert.assertNotEquals(actual, expected, 0.001);
    }

    @Test
    public void segmentVolumePositiveTest() {
        double height = 1.5;
        double actual = sphereAction.segmentVolume(sphere, height);
        double expected = 1.570;
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void segmentVolumeNegativeTest() {
        double height = 1.5;
        double actual = sphereAction.segmentVolume(sphere, height);
        double expected = 1.580;
        Assert.assertNotEquals(actual, expected, 0.001);
    }

    @Test
    public void volumeRatioCuttingXYPositiveTest() {
        double actual = sphereAction.volumeRatioCuttingXY(sphere);
        double expected = 0.333;
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void volumeRatioCuttingXYNegativeTest() {
        double actual = sphereAction.volumeRatioCuttingXY(sphere);
        double expected = 0.833;
        Assert.assertNotEquals(actual, expected, 0.001);
    }

    @Test
    public void volumeRatioCuttingXZPositiveTest() {
        double actual = sphereAction.volumeRatioCuttingXZ(sphere);
        double expected = 0.333;
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void volumeRatioCuttingXZNegativeTest() {
        double actual = sphereAction.volumeRatioCuttingXZ(sphere);
        double expected = 0.363;
        Assert.assertNotEquals(actual, expected, 0.001);
    }

    @Test
    public void volumeRatioCuttingZYPositiveTest() {
        double actual = sphereAction.volumeRatioCuttingXZ(sphere);
        double expected = 0.333;
        Assert.assertEquals(actual, expected, 0.001);
    }

    @Test
    public void volumeRatioCuttingZYNegativeTest() {
        double actual = sphereAction.volumeRatioCuttingXZ(sphere);
        double expected = 0.933;
        Assert.assertNotEquals(actual, expected, 0.001);
    }

    @AfterClass
    public void tearDown() {
        sphereAction = null;
        sphere = null;
    }
}
