package by.gaponenko.sphere.specification.impl;

import by.gaponenko.sphere.entity.Sphere;
import by.gaponenko.sphere.entity.SphereParameters;
import by.gaponenko.sphere.entity.WareHouse;
import by.gaponenko.sphere.specification.Specification;

public class IntervalSquareSpecification implements Specification {
    private double minSquare;
    private double maxSquare;

    public IntervalSquareSpecification(double minSquare, double maxSquare) {
        this.minSquare = minSquare;
        this.maxSquare = maxSquare;
    }

    @Override
    public boolean specify(Sphere sphere) {
        WareHouse wareHouse = WareHouse.getInstance();
        SphereParameters parameters = wareHouse.get(sphere.getSphereId());
        return (parameters.getSquare() >= minSquare
                && parameters.getSquare() <= maxSquare);
    }
}
