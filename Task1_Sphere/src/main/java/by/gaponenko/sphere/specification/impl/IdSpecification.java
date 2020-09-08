package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.specification.Specification;

public class IdSpecification implements Specification {
    private long sphereId;

    public IdSpecification(long sphereId) {
        this.sphereId = sphereId;
    }

    @Override
    public boolean specify(Sphere sphere) {
        return (sphere.getSphereId() == sphereId);
    }
}
