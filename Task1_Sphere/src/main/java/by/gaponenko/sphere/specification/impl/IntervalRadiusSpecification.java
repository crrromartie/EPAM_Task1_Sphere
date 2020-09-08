package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

public class IntervalRadiusSpecification implements Specification {
    private double minRadius;
    private double maxRadius;

    public IntervalRadiusSpecification(double minRadius, double maxRadius) {
        this.minRadius = minRadius;
        this.maxRadius = maxRadius;
    }

    @Override
    public boolean specify(Sphere sphere) {
        return (sphere.getRadius() >= minRadius && sphere.getRadius() <= maxRadius);
    }
}
