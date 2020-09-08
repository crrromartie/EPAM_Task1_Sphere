package test.by.gaponenko.sphere.parser;

import by.gaponenko.sphere.parser.DataParser;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataParserTest {
    DataParser dataParser;

    @BeforeClass
    public void setUp() {
        dataParser = new DataParser();
    }

    @Test
    public void parsDataTest() {
        List<String> strings = new ArrayList<>();
        strings.add("g 5.4 8.2 7.3");
        strings.add("3.8 9.7 2.1 9.0");
        strings.add("1.5 3.0 4.1");
        strings.add("8.0 -3.2 0.2 5.4");
        List<List<Double>> actual = dataParser.parsData(strings);
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
        List<List<Double>> expected = new ArrayList<>();
        expected.add(line1);
        expected.add(line2);
        Assert.assertEquals(actual, expected);
    }

    @AfterClass
    public void tearDown() {
        dataParser = null;
    }
}
