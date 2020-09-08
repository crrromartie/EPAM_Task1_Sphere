package test.by.gaponenko.sphere.reader;

import by.gaponenko.sphere.exception.SphereException;
import by.gaponenko.sphere.reader.DataReader;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {
    DataReader dataReader;

    @BeforeClass
    public void setUp() {
        dataReader = new DataReader();
    }

    @Test(dataProvider = "dataForReader")
    public void readDataTest(List<String> expected) throws SphereException {
        String filePath = "src/main/resources/data/data.txt";
        List<String> actual = dataReader.readData(filePath);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "dataForReader")
    public Object[][] dataForRead() {
        List<String> strings = new ArrayList<>();
        strings.add("3.5  4.2  -7.8  5.6");
        strings.add("4.5  9.6  2.1.2  9.3");
        strings.add("2.2  3.3  4.4  -8.5");
        strings.add("1.1  -1.1  2.2  7.9");
        strings.add("5.6  8.9  1.6  4.1");
        strings.add("2.5  2.5  1.5  8.0");
        strings.add("9.3  5.4 f  7.8");
        strings.add("1.2  5.0  2.5");
        strings.add("2.5  8.9  8.9  -6.0");
        strings.add("   6.5  7.8  9.4  7.3");
        return new Object[][]{{strings}};
    }

    @Test(expectedExceptions = SphereException.class)
    public void throwSphereExceptionTest() throws SphereException {
        dataReader.readData("src/main/resources/data/dat.txt");
    }

    @AfterClass
    public void tearDown() {
        dataReader = null;
    }
}
