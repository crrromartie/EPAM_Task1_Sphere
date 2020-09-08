package by.gaponenko.sphere.validator;

public class ParametersValidator {
    private static final int NUMBER_SPHERE_PARAMETERS = 4;

    private ParametersValidator() {
    }

    public static boolean isCorrectNumberOfParameters(String[] parameters) {
        return (parameters != null && parameters.length == NUMBER_SPHERE_PARAMETERS);
    }
}
