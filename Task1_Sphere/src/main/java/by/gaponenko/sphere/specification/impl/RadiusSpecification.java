package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

public class RadiusSpecification implements Specification {
    private double radius;

    public RadiusSpecification(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean specify(Sphere sphere) {
        return (sphere.getRadius() == radius);
    }
}
