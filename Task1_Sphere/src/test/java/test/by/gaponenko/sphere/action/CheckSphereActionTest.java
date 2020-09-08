package test.by.gaponenko.sphere.action;

import by.gaponenko.sphere.action.CheckSphereAction;
import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.entity.Sphere;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckSphereActionTest {
    CheckSphereAction checkSphereAction;
    Sphere sphere1;
    Sphere sphere2;
    Sphere sphere3;

    @BeforeClass
    public void setUp() {
        checkSphereAction = new CheckSphereAction();
        sphere1 = new Sphere(1, new Point(5, 0, 0), 5.0);
        sphere2 = new Sphere(1, new Point(5, 0, 0), -5.0);
        sphere3 = new Sphere(1, new Point(6, 0, 0), 5.0);
    }

    @Test
    public void isSpherePositiveTest() {
        boolean actual = checkSphereAction.isSphere(sphere1);
        Assert.assertTrue(actual);
    }

    @Test
    public void isSphereNegativeTest() {
        boolean actual = checkSphereAction.isSphere(sphere2);
        Assert.assertFalse(actual);
    }

    @Test
    public void isTouchesAnyCoordinatePlanePositiveTest() {
        boolean actual = checkSphereAction.isTouchesAnyCoordinatePlane(sphere1);
        Assert.assertTrue(actual);
    }

    @Test
    public void isTouchesAnyCoordinatePlaneNegativeTest() {
        boolean actual = checkSphereAction.isTouchesAnyCoordinatePlane(sphere3);
        Assert.assertFalse(actual);
    }

    @AfterClass
    public void tearDown() {
        checkSphereAction = null;
        sphere1 = null;
        sphere2 = null;
        sphere3 = null;
    }
}
