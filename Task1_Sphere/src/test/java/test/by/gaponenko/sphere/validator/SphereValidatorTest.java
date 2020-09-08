package test.by.gaponenko.sphere.validator;

import by.gaponenko.sphere.validator.SphereValidator;
import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.entity.Sphere;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SphereValidatorTest {
    Sphere sphere1;
    Sphere sphere2;

    @BeforeClass
    public void setUp() {
        sphere1 = new Sphere(1, new Point(1.0, 2.0, 3.0), 4.0);
        sphere2 = new Sphere(1, new Point(1.0, 2.0, 3.0), -4.0);
    }

    @Test
    public void isSpherePositiveTest() {
        boolean actual = SphereValidator.isSphere(sphere1);
        Assert.assertTrue(actual);
    }

    @Test
    public void isSphereNegativeTest() {
        boolean actual = SphereValidator.isSphere(sphere2);
        Assert.assertFalse(actual);
    }

    @AfterClass
    public void tearDown() {
        sphere1 = null;
        sphere2 = null;
    }
}
