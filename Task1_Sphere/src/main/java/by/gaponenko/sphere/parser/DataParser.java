package by.gaponenko.sphere.parser;

import by.gaponenko.sphere.validator.DataValidator;
import by.gaponenko.sphere.validator.ParametersValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DataParser {
    static Logger logger = LogManager.getLogger();
    private static final String REGEX_DELIMITER = "\\s+";

    public List<List<Double>> parsData(List<String> lines) {
        List<List<Double>> sphereLines = new ArrayList<>();
        for (String line : lines) {
            String[] elements = line.strip().split(REGEX_DELIMITER);
            List<Double> parameters = new ArrayList<>();
            for (String element : elements) {
                if (ParametersValidator.isCorrectNumberOfParameters(elements)
                        && DataValidator.isDoubleData(elements)) {
                    parameters.add(Double.parseDouble(element));
                }
            }
            if (!parameters.isEmpty()) {
                sphereLines.add(parameters);
            }
        }
        logger.log(Level.INFO, "List parsed successfully!");
        return sphereLines;
    }
}

