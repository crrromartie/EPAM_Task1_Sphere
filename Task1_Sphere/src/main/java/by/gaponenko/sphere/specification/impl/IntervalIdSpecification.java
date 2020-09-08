package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

public class IntervalIdSpecification implements Specification {
    private long minSphereId;
    private long maxSphereId;

    public IntervalIdSpecification(long minSphereId, long maxSphereId) {
        this.minSphereId = minSphereId;
        this.maxSphereId = maxSphereId;
    }

    @Override
    public boolean specify(Sphere sphere) {
        return (sphere.getSphereId() >= minSphereId && sphere.getSphereId() <= maxSphereId);
    }
}
