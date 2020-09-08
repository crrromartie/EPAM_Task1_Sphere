package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

public class IntervalXCoordinateSpecification implements Specification {
    private double minX;
    private double maxX;

    public IntervalXCoordinateSpecification(double minX, double maxX) {
        this.minX = minX;
        this.maxX = maxX;
    }

    @Override
    public boolean specify(Sphere sphere) {
        return (sphere.getCenter().getX() >= minX
                && sphere.getCenter().getX() <= maxX);
    }
}
