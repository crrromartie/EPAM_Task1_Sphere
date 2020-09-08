package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

public class CenterSpecification implements Specification {
    private double x;
    private double y;
    private double z;

    public CenterSpecification(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean specify(Sphere sphere) {
        return (sphere.getCenter().getX() == x
                && sphere.getCenter().getY() == y
                && sphere.getCenter().getZ() == z);
    }
}
