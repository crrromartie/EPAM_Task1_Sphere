package test.by.gaponenko.sphere.factory;

import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.exception.SphereException;
import by.gaponenko.sphere.factory.SphereFactory;
import by.gaponenko.sphere.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SphereFactoryTest {
    SphereFactory sphereFactory;
    Sphere actual;
    Sphere expected1;
    Sphere expected2;

    @BeforeClass
    void setUp() {
        IdGenerator.setId(0);
        sphereFactory = new SphereFactory();
        IdGenerator.setId(0);
        expected1 = new Sphere(IdGenerator.generateId(), new Point(0, 0, 0), 5.5);
        IdGenerator.setId(0);
        expected2 = new Sphere(IdGenerator.generateId(), new Point(0, 4.5, 0), 5.5);
    }

    @Test
    void createPositiveTest() throws SphereException {
        IdGenerator.setId(0);
        actual = sphereFactory.create(new Point(0, 0, 0), 5.5);
        Assert.assertEquals(actual, expected1);
    }

    @Test
    void createNegativeTest() throws SphereException {
        IdGenerator.setId(0);
        actual = sphereFactory.create(new Point(0, 0, 0), 5.5);
        Assert.assertNotEquals(actual, expected2);
    }

    @Test(expectedExceptions = SphereException.class,
            expectedExceptionsMessageRegExp = "Radius must be greater than zero!")
    void createTest() throws SphereException {
        sphereFactory.create(new Point(0, 0, 0), -5.5);
    }

    @AfterClass
    void tearDown() {
        sphereFactory = null;
        actual = null;
        expected1 = null;
        expected2 = null;
    }
}
