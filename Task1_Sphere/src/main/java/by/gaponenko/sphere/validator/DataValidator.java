package by.gaponenko.sphere.validator;

public class DataValidator {
    private static final String REGEX_DIGIT_DOUBLE = "^-?\\d{1,3}\\.\\d{1,2}";

    private DataValidator() {
    }

    public static boolean isDoubleData(String[] strings) {
        if (strings == null) {
            return false;
        }
        int counterNotValidElements = 0;
        for (String item : strings) {
            if (!item.matches(REGEX_DIGIT_DOUBLE)) {
                counterNotValidElements++;
            }
        }
        return (counterNotValidElements == 0);
    }
}
