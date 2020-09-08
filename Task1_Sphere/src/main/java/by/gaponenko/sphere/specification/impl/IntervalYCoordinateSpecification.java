package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

public class IntervalYCoordinateSpecification implements Specification {
    private double minY;
    private double maxY;

    public IntervalYCoordinateSpecification(double minY, double maxY) {
        this.minY = minY;
        this.maxY = maxY;
    }

    @Override
    public boolean specify(Sphere sphere) {
        return (sphere.getCenter().getY() >= minY
                && sphere.getCenter().getY() <= maxY);
    }
}
