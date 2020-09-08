package test.by.gaponenko.sphere.factory;

import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.entity.SphereParameters;
import by.gaponenko.sphere.factory.SphereParametersFactory;
import by.gaponenko.sphere.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SphereParametersFactoryTest {
    SphereParametersFactory sphereParametersFactory;
    SphereParameters actual;
    SphereParameters expected1;
    SphereParameters expected2;
    Sphere sphere;

    @BeforeClass
    void setUp() {
        sphereParametersFactory = new SphereParametersFactory();
        expected1 = new SphereParameters(4.1887902047863905, 12.566370614359172);
        expected2 = new SphereParameters(4.1887902047863955, 12.566370614359177);
        sphere = new Sphere(IdGenerator.generateId(), new Point(0, 0, 0), 1);
    }

    @Test
    void createSphereParametersPositiveTest() {
        actual = sphereParametersFactory.create(sphere);
        Assert.assertEquals(actual, expected1);
    }

    @Test
    void createSphereParametersNegativeTest() {
        actual = sphereParametersFactory.create(sphere);
        Assert.assertNotEquals(actual, expected2);
    }

    @AfterClass
    void tearDown() {
        sphereParametersFactory = null;
        actual = null;
        expected1 = null;
        expected2 = null;
        sphere = null;
    }
}
