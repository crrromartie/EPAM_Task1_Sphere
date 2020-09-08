package test.by.gaponenko.sphere.generator;

import by.gaponenko.sphere.generator.IdGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IdGeneratorTest {
    @Test
    void generateIdNotNullTest() {
        long actual = IdGenerator.generateId();
        Assert.assertNotNull(actual);
    }
}
