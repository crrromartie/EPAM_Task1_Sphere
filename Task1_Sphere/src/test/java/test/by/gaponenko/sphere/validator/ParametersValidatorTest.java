package test.by.gaponenko.sphere.validator;

import by.gaponenko.sphere.validator.ParametersValidator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParametersValidatorTest {
    String[] parameters1;
    String[] parameters2;

    @BeforeClass
    public void setUp() {
        parameters1 = new String[]{"1.0", "2.0", "3.0", "4.0"};
        parameters2 = new String[]{"1.0", "2.0", "3.0"};
    }

    @Test
    public void isCorrectNumberOfParametersPositiveTest() {
        boolean actual = ParametersValidator.isCorrectNumberOfParameters(parameters1);
        Assert.assertTrue(actual);
    }

    @Test
    public void isCorrectNumberOfParametersNegativeTest() {
        boolean actual = ParametersValidator.isCorrectNumberOfParameters(parameters2);
        Assert.assertFalse(actual);
    }

    @AfterClass
    public void tearDown() {
        parameters1 = null;
        parameters2 = null;
    }
}
