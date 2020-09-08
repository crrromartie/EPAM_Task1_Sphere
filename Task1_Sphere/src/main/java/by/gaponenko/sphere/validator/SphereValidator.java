package by.gaponenko.sphere.validator;

import by.gaponenko.sphere.entity.Sphere;

public class SphereValidator {
    private SphereValidator() {
    }

    public static boolean isSphere(Sphere sphere) {
        if (sphere == null) {
            return false;
        }
        return (sphere.getRadius() > 0);
    }
}
