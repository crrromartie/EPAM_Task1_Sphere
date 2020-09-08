package test.by.gaponenko.sphere.creator;

import by.gaponenko.sphere.creator.DataCreator;
import by.gaponenko.sphere.entity.Point;
import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataCreatorTest {
    DataCreator dataCreator;

    @BeforeClass
    public void setUp() {
        dataCreator = new DataCreator();
    }

    @Test
    public void createSpheresTest() {
        List<Double> line1 = new ArrayList<>();
        line1.add(3.8);
        line1.add(9.7);
        line1.add(2.1);
        line1.add(9.0);
        List<Double> line2 = new ArrayList<>();
        line2.add(8.0);
        line2.add(-3.2);
        line2.add(0.2);
        line2.add(5.4);
        List<List<Double>> spheresLines = new ArrayList<>();
        spheresLines.add(line1);
        spheresLines.add(line2);
        IdGenerator.setId(0);
        List<Sphere> actual = dataCreator.createSpheres(spheresLines);
        List<Sphere> expected = new ArrayList<>();
        expected.add(new Sphere(1, new Point(3.8, 9.7, 2.1), 9));
        expected.add(new Sphere(2, new Point(8.0, -3.2, 0.2), 5.4));
        Assert.assertEquals(actual, expected);
    }

    @AfterClass
    public void tearDown() {
        dataCreator = null;
    }
}
