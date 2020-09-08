package test.by.gaponenko.sphere.validator;

import by.gaponenko.sphere.validator.DataValidator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataValidatorTest {
    @Test(dataProvider = "dataForValidationPositiveTest")
    public void isDoubleDataPositiveTest(String[] arrayStrings) {
        boolean actual = DataValidator.isDoubleData(arrayStrings);
        Assert.assertTrue(actual);
    }

    @DataProvider(name = "dataForValidationPositiveTest")
    public Object[][] dataForValidationPositiveTest() {
        return new Object[][]{
                {"-2.5", "1.3", "4.5", "-7.9"},
                {"-84.51", "-10.30", "78.55", "96.90"},
                {"-2.6", "8.5", "1.5", "6.1"},
                {"2.0", "3.0", "4.0", "5.0"}
        };
    }

    @Test(dataProvider = "dataForValidationNegativeTest")
    public void isDoubleDataNegativeTest(String[] arrayStrings) {
        boolean actual = DataValidator.isDoubleData(arrayStrings);
        Assert.assertFalse(actual);
    }

    @DataProvider(name = "dataForValidationNegativeTest")
    public Object[][] dataForValidationNegativeTest() {
        return new Object[][]{
                {"-2.5.5", "1.3", "4.5", "-7.9"},
                {"-84.51", "d", "78.55", "96.90"},
                {"-2.p", "8.5", "1.5", "6.1"},
                {"2.0", "3.0", "4.0", "--5.0"}
        };
    }
}
