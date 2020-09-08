package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

public class IntervalZCoordinateSpecification implements Specification {
    private double minZ;
    private double maxZ;

    public IntervalZCoordinateSpecification(double minZ, double maxZ) {
        this.minZ = minZ;
        this.maxZ = maxZ;
    }

    @Override
    public boolean specify(Sphere sphere) {
        return (sphere.getCenter().getZ() >= minZ
                && sphere.getCenter().getZ() <= maxZ);
    }
}
